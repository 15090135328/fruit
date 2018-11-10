package com.zhiyou100.fruitappol.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "fruit_detail")
@Data
public class FruitEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
   //商品名称
    private String name;
    //商品价格
    private BigDecimal price;
    //已售出数量
    @Column(name = "sale_num")
    private String saleNum;
    //已分享数量
    @Column(name = "share_num")
    private String shareNum;
    //库存
    private int inventory;
    //最后修改时间
    @Column(name = "last_time")
    private Date lastTime;

}
