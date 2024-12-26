package ir.maktabsharif.hw10.repository;

import ir.maktabsharif.hw10.model.User;
import ir.maktabsharif.hw10.util.EntityManagerProvider;

import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl extends BaseRepositoryImpl<User , Long> implements UserRepository {
    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }


    @Override
    public List<User> findByUsername(String usernameInput) {
        String jpql = "SELECT u FROM User u WHERE u.userName = :username";
        TypedQuery<User> query = EntityManagerProvider.getEntityManager().createQuery(jpql, User.class);
        query.setParameter("username", usernameInput);
        List<User> resultList = query.getResultList();
        return resultList;


    }

    @Override
    public Optional<User> findByUsernameAndPassword(String username, String password) {
        String jpql = "select u from User u where u.userName = :username and u.password = :password";
        TypedQuery<User> query = EntityManagerProvider.getEntityManager().createQuery(jpql, User.class);
        query.setParameter("username", username);
        query.setParameter("password", password);
        return Optional.ofNullable(query.getSingleResult());
    }
}
