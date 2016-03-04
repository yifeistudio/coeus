package com.yifeistudio.coeus.dao;

import java.util.List;

/**
 * Common DAO module.
 * Created by yi on 16-3-4.
 */
public interface CommonDAO<T> {

    void save(T entity);

    void update(T entity);

    void delete(String id);

    T findById(String id);

    List<T> findByHQL(String hql, Object... params);
}
