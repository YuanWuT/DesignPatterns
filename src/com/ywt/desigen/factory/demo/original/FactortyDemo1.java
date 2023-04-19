package com.ywt.desigen.factory.demo.original;
import com.ywt.desigen.factory.demo.Fruit;
import com.ywt.desigen.factory.demo.pojo.Apple;
import com.ywt.desigen.factory.demo.pojo.Banana;
import com.ywt.desigen.factory.demo.pojo.Orange;

/**
 * @Auther:yuanwt
 * @Date:2023-03-29 - 03 - 29 - 11:49
 * @Description: com.msb.factory
 * @Version: 1.0
 */
public class FactortyDemo1 {
    public static void main(String[] args) {
        Fruit f1 = new Factory1().getInstance(new Apple());
        Fruit f2 = new Factory1().getInstance(new Orange());
        Fruit f3 = new Factory1().getInstance(new Banana());
        f1.eat();
        f2.eat();
        //f3.eat();
        //增加新的类时需要修改原工厂代码（增加对Banana的判断）

    }
}
