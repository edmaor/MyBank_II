package edu.maor.mybank.dao;

import edu.maor.mybank.MyBank;
import jakarta.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

public class MyBankDao<T, K extends Serializable>  implements DAO<T,K> {

    static Session session = MyBank.getSessionFactory().getCurrentSession();

    static {
        if (session == null ) {
            MyBank.initialize();
            session = MyBank.getSessionFactory().getCurrentSession();
        }
    }
    private final Class<T> entityClass;

    public MyBankDao( Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public void save(Object entity) {
        session.persist(entity);
    }

    @Override
    public void update(Object entity) {
        session.merge(entity);
    }

    @Override
    public void delete(Object entity) {
        session.remove(entity);
    }

    @Override
    public T findById(K id) {
        return session.get(entityClass, id);
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> query = session.getCriteriaBuilder().createQuery(entityClass);
        query.select(query.from(entityClass));
        return session.createQuery(query).getResultList();
    }
}
