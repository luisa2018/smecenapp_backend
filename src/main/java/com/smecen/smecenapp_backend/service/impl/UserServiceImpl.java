package com.smecen.smecenapp_backend.service.impl;



import com.smecen.smecenapp_backend.model.User;
import com.smecen.smecenapp_backend.repo.IGenericRepo;
import com.smecen.smecenapp_backend.repo.IUserRepo;
import com.smecen.smecenapp_backend.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UserServiceImpl extends CRUDImpl<User, Integer> implements IUserService {

    @Autowired
    private IUserRepo repo;

    @Override
    protected IGenericRepo<User, Integer> getRepo() {
        return repo;
    }

}
