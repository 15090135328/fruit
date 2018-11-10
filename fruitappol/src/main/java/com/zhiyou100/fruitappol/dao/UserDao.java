package com.zhiyou100.fruitappol.dao;

import com.zhiyou100.fruitappol.entity.FruitEntity;
import com.zhiyou100.fruitappol.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<UserEntity,Integer> {
    Optional<UserEntity> findByNameAndPassword(String name,String password);
    Optional<UserEntity> save(String name,String password);

    Optional<UserEntity> findByName(String username);
}
