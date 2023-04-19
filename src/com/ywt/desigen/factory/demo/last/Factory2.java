package com.ywt.desigen.factory.demo.last;

import com.ywt.desigen.factory.demo.Fruit;

/**
 * @Auther:yuanwt
 * @Date:2023-03-29 - 03 - 29 - 13:52
 * @Description: com.msb.factory.pojo
 * @Version: 1.0
 */
public class Factory2 {
    public Fruit getInstance(String className) {
        Fruit f = null;
        try {
            //通过反射实现对象的创建，在不改变工厂代码的情况下可以支持业务拓展(增加Banana类)
            f = (Fruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;

    }
}
