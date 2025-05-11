package com.smecen.smecenapp_backend.service.impl;

import com.smecen.smecenapp_backend.repo.IGenericRepo;
import com.smecen.smecenapp_backend.service.ICRUD;

import java.util.List;
import java.util.Optional;

public abstract class CRUDImpl <T, ID> implements ICRUD<T, ID> {

    protected abstract IGenericRepo<T, ID> getRepo();

    @Override
    public T register(T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public T update(T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public List<T> list() throws Exception {
        return getRepo().findAll();
    }

    @Override
    public T listToId(ID id) throws Exception {
        Optional<T> obj = getRepo().findById(id);
        return obj.orElse(null);
    }

    @Override
    public void delete(ID id) throws Exception {
        getRepo().deleteById(id);
    }
}
