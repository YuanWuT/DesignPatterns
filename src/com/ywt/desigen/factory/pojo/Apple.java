package com.ywt.desigen.factory.pojo;

import com.ywt.desigen.factory.demo.Fruit;

/**
 * @Auther:yuanwt
 * @Date:2023-03-29 - 03 - 29 - 10:49
 * @Description: com.msb.factory
 * @Version: 1.0
 */
public class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
