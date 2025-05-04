package com.smecen.smecenapp_backend.service.impl;

import com.smecen.smecenapp_backend.model.Journey;
import com.smecen.smecenapp_backend.repo.IJourneyRepo;
import com.smecen.smecenapp_backend.service.IJourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JourneyServiceImpl  implements IJourneyService {

    @Autowired
    private IJourneyRepo repo;
    @Override
    public Journey register(Journey t) throws Exception {
        return repo.save(t);
    }

    @Override
    public Journey update(Journey t) throws Exception {
        return null;
    }

    @Override
    public List<Journey> list() throws Exception {
        return null;
    }

    @Override
    public Journey listToId(Integer integer) throws Exception {
        return null;
    }

    @Override
    public void delete(Integer integer) throws Exception {

    }
}
