package com.ywt.desigen.template.demo.original;

import com.ywt.desigen.template.demo.last.Student;

/**
 * @Auther:yuanwt
 * @Date:2023-04-19 - 04 - 19 - 15:48
 * @Description: 作文标题、开头、结尾一致，只有正文需要自己写（即代码多处需要，只有部分不一样）
 * @Version: 1.0
 */
public class ChildrenStudent {
   private static  String name;
    public static void main(String[] args) {
        System.out.println("我是标题");
        System.out.println("我是开头");
        System.out.println("我是小学生"+name+"正文");
        System.out.println("我是结尾");
    }
}
