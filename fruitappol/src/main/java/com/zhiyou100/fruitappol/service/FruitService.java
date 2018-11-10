package com.zhiyou100.fruitappol.service;

import com.zhiyou100.fruitappol.dao.FruitDao;

import com.zhiyou100.fruitappol.entity.FruitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FruitService {
    @Autowired
    FruitDao fruitDao;
    public Optional<FruitEntity> findById(int id){
        Optional<FruitEntity> fruitEntity = fruitDao.findById(id);
        return fruitEntity;
    }
}
