package com.yifeistudio.coeus.services;

import com.yifeistudio.coeus.dao.CommonDAO;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * Created by yi on 16-3-4.
 */

@Transactional
public abstract class CommonServiceImpl<T> implements CommonService<T> {

    private CommonDAO<T> dao;

    @Resource
    public void setDao(CommonDAO<T> dao) {
        this.dao = dao;
    }
    @Override
    public void save(T entity) {
        dao.save(entity);
    }

    @Override
    public void update(T entity) {
        dao.update(entity);
    }

    @Override
    public void delete(String id) {
        dao.delete(id);
    }

    @Override
    public T getById(String id) {
        return dao.findById(id);
    }

    @Override
    public List<T> getByHQL(String hql, Object... params) {
        return dao.findByHQL(hql, params);
    }
}
