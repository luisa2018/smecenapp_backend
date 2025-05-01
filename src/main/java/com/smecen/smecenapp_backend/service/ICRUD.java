package com.smecen.smecenapp_backend.service;

import java.util.List;

public interface ICRUD <T, ID>{
    T registrar(T j)  throws Exception;
    T modifcar(T j) throws Exception;
    List<T> listar() throws Exception;
    T listarPorId(ID id)  throws Exception;
    void eliminar(ID id)  throws Exception;
}
