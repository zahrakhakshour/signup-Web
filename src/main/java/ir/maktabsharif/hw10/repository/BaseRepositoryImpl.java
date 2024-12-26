package ir.maktabsharif.hw10.repository;

import com.sun.xml.bind.v2.model.core.ID;
import ir.maktabsharif.hw10.model.BaseModel;
import ir.maktabsharif.hw10.util.EntityManagerProvider;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import java.util.List;
import java.util.Optional;

public abstract class BaseRepositoryImpl<T extends BaseModel, ID> implements BaseRepository<T, ID> {
    @Override
    public void delete(T t) {
        EntityManager em = EntityManagerProvider.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        T t1 = em.find(getEntityClass(), t.getId());
        if (t1 != null) {
            em.remove(t1);
        } else throw new EntityNotFoundException();
        transaction.commit();
        em.close();
    }

    @Override
    public List<T> findAll() {
        return EntityManagerProvider.getEntityManager().createQuery("from " + getEntityClass().getName(), getEntityClass()).getResultList();
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(EntityManagerProvider.getEntityManager().find(getEntityClass(), id));
    }

    @Override
    public void save(T t) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        if (t.getId() == null) {
            entityManager.persist(t);
        } else entityManager.merge(t);
        transaction.commit();
        entityManager.close();
    }
}
