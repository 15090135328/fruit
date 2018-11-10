package com.zhiyou100.fruitappol.dao;

import com.zhiyou100.fruitappol.entity.FruitEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FruitDao extends JpaRepository<FruitEntity,Integer> {
    Optional<FruitEntity> findById(int id);

}
