package com.zhiyou100.fruitappol.controller;
import com.zhiyou100.fruitappol.entity.FruitEntity;
import com.zhiyou100.fruitappol.service.FruitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;
@Slf4j
@RequestMapping("/fruit")
@Controller
public class FruitController {
    @Autowired
    FruitService fruitService;
    @RequestMapping("/detail.do")
    @ResponseBody
    public FruitEntity fruitDetail(int id){
        Optional<FruitEntity> fruit = fruitService.findById(id);

        if(fruit.isPresent()){
            return fruit.get();
        }
        return null;
    }

}
