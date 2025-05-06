package com.smecen.smecenapp_backend.service;

import java.util.List;

public interface ICRUD <T, ID>{
    T register(T t)  throws Exception;
    T update(T t) throws Exception;
    List<T> list() throws Exception;
    T listToId(ID id)  throws Exception;
    void delete(ID id)  throws Exception;
}
