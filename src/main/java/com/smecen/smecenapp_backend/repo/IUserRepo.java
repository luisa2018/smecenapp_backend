package com.smecen.smecenapp_backend.repo;

import com.smecen.smecenapp_backend.model.User;

import java.util.Optional;

public interface IUserRepo  extends IGenericRepo<User, Integer> {
    Optional<User> findByEmail(String email);
}
