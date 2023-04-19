package com.ywt.desigen.factory.pojo;


import com.ywt.desigen.factory.demo.Fruit;

/**
 * @Auther:yuanwt
 * @Date:2023-03-29 - 03 - 29 - 14:09
 * @Description: com.msb.factory.pojo
 * @Version: 1.0
 */
public class Banana implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }
}
