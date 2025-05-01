package com.smecen.smecenapp_backend.impl;

import com.smecen.smecenapp_backend.model.Journey;
import com.smecen.smecenapp_backend.repository.IJourneyRepo;
import com.smecen.smecenapp_backend.service.IJourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JourneyServiceImpl  implements IJourneyService {

    @Autowired
    private IJourneyRepo repo;
    @Override
    public Journey registrar(Journey p) throws Exception {
        return repo.save(p);
    }

    @Override
    public Journey modifcar(Journey p) throws Exception {
        return null;
    }

    @Override
    public List<Journey> listar() throws Exception {
        return null;
    }

    @Override
    public Journey listarPorId(Integer integer) throws Exception {
        return null;
    }

    @Override
    public void eliminar(Integer integer) throws Exception {

    }
}
