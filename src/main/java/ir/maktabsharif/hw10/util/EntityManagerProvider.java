package ir.maktabsharif.hw10.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {

    private static EntityManagerFactory emf = null;

    public static EntityManager getEntityManager() {

        if(emf == null) {
            synchronized(EntityManagerProvider.class) {
                if(emf == null) {
                    emf = Persistence.createEntityManagerFactory("login");
                }
            }
        }
    return  emf.createEntityManager();
    }
}
