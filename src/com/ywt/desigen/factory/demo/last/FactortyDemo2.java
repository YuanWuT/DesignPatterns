package com.ywt.desigen.factory.demo.last;


import com.ywt.desigen.factory.demo.Fruit;

/**
 * @Auther:yuanwt
 * @Date:2023-03-29 - 03 - 29 - 11:49
 * @Description: com.msb.factory
 * @Version: 1.0
 */
public class FactortyDemo2 {
    public static void main(String[] args) {
        Fruit f1 = new Factory2().getInstance("com.ywt.desigen.factory.demo.pojo.Apple");
        Fruit f2 = new Factory2().getInstance("com.ywt.desigen.factory.demo.pojo.Orange");
        //增加新的类不用改变原工厂代码
        Fruit f3 = new Factory2().getInstance("com.ywt.desigen.factory.demo.pojo.Banana");

        f1.eat();
        f2.eat();
        f3.eat();
    }
}
