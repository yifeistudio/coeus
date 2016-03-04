package com.yifeistudio.coeus.services;

import java.util.List;

/**
 * Common service module.
 * Created by yi on 16-3-4.
 */
public interface CommonService<T> {

    void save(T entity);

    void update(T entity);

    void delete(String id);

    T getById(String id);

    List<T> getByHQL(String hql, Object... params);

}
