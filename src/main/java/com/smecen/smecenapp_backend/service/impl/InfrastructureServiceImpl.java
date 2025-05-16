package com.smecen.smecenapp_backend.service.impl;

import com.smecen.smecenapp_backend.model.Infrastructure;
import com.smecen.smecenapp_backend.repo.IGenericRepo;
import com.smecen.smecenapp_backend.repo.IInfrastructureRepo;
import com.smecen.smecenapp_backend.service.IInfrastructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfrastructureServiceImpl extends CRUDImpl<Infrastructure, Integer> implements IInfrastructureService {
    @Autowired
    private IInfrastructureRepo repo;

    @Override
    protected IGenericRepo<Infrastructure, Integer> getRepo() {
        return repo;
    }
}
