package com.ywt.desigen.template.demo.last;

/**
 * @Auther:yuanwt
 * @Date:2023-04-19 - 04 - 19 - 16:24
 * @Description: com.ywt.desigen.template.demo.last
 * @Version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        Student s1 = new ChildrenStudent();
        s1.setName("三年级李小三");
        s1.write();
        System.out.println("--------------");
        Student s2 = new MiddleStusent();
        s2.setName("高二年级高二二");
        s2.write();
    }
}
