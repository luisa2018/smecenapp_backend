package com.smecen.smecenapp_backend.service.impl;

import com.smecen.smecenapp_backend.model.Journey;
import com.smecen.smecenapp_backend.repo.IGenericRepo;

import com.smecen.smecenapp_backend.repo.IJourneyRepo;
import com.smecen.smecenapp_backend.service.IJourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JourneyServiceImpl   extends CRUDImpl<Journey, Integer> implements IJourneyService  {

    @Autowired
    private IJourneyRepo repo;

    @Override
    protected IGenericRepo<Journey, Integer> getRepo() {
        return repo;
    }
}
