package com.smecen.smecenapp_backend.service.impl;



import com.smecen.smecenapp_backend.model.User;
import com.smecen.smecenapp_backend.repo.IGenericRepo;
import com.smecen.smecenapp_backend.repo.IUserRepo;
import com.smecen.smecenapp_backend.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public  class UserServiceImpl extends CRUDImpl<User, Integer> implements IUserService {

    @Autowired
    private IUserRepo repo;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    protected IGenericRepo<User, Integer> getRepo() {
        return repo;
    }

    @Override
    public User register(User user) throws Exception {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return super.register(user);
    }

}
