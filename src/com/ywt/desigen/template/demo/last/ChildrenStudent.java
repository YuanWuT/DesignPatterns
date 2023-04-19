package com.ywt.desigen.template.demo.last;

/**
 * @Auther:yuanwt
 * @Date:2023-04-19 - 04 - 19 - 15:48
 * @Description: com.ywt.desigen.template.demo.original
 * @Version: 1.0
 */
public class ChildrenStudent extends Student {

    @Override
    public void write(String name) {
        System.out.println("我是小学生"+name+"正文");
    }
}
