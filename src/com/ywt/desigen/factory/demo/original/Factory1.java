package com.ywt.desigen.factory.demo.original;
import com.ywt.desigen.factory.demo.Fruit;
import com.ywt.desigen.factory.pojo.Apple;
import com.ywt.desigen.factory.pojo.Orange;

/**
 * @Auther:yuanwt
 * @Date:2023-03-29 - 03 - 29 - 11:32
 * @Description: com.msb.factory
 * @Version: 1.0
 */
public class Factory1 {
    public Fruit getInstance(Fruit fruit){
        Fruit f = null;
        //弊端：新增加Fruit的实现类，都需修改代码，增加if判断(如增加Banana) 可以优化为使用反射创建对象
        if(fruit instanceof Apple){
            f = new Apple();
        }else if (fruit instanceof Orange){
            f = new Orange();
        }
        return  f;
    }
}
