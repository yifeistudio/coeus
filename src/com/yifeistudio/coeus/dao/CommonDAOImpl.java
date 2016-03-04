package com.yifeistudio.coeus.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * Implement common DAO interface.
 * Created by yi on 16-3-4.
 */
public abstract class CommonDAOImpl<T> implements CommonDAO {

    private Class<T> tClass;

    @Resource
    private SessionFactory sessionFactory;

    protected Session getSession() {

        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Object entity) {
        this.getSession().save(entity);
    }

    @Override
    public void update(Object entity) {
        this.getSession().update(entity);
    }

    @Override
    public void delete(String id) {
        this.getSession().delete(this.findById(id));
    }

    @SuppressWarnings("unchecked")
    @Override
    public T findById(String id) {
        return (T) this.getSession().get(this.tClass, id);
    }

    @Override
    public List findByHQL(String hql, Object... params) {

        Query query = this.getSession().createQuery(hql);
        for (int i = 0; params != null && i < params.length; i++) {
            query.setParameter(i, params);
        }
        return query.list();
    }
}
///~End of File.