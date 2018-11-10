package com.zhiyou100.fruitappol.service;

import com.zhiyou100.fruitappol.dao.UserDao;
import com.zhiyou100.fruitappol.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public Optional<UserEntity> findByNameAndPassword(String username, String password) {
        Optional<UserEntity> userEntity = userDao.findByNameAndPassword(username, password);
        return userEntity;

    }

    public Optional<UserEntity> findByName(String username) {
        Optional<UserEntity> userEntity = userDao.findByName(username);
        return userEntity;
    }
}
