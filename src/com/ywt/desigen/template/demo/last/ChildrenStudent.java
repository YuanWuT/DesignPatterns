package com.ywt.desigen.template.demo.last;

/**
 * @Auther:yuanwt
 * @Date:2023-04-19 - 04 - 19 - 15:48
 * @Description: com.ywt.desigen.template.demo.original
 * @Version: 1.0
 */
public class ChildrenStudent extends Student {

    @Override
    public String writeMain(String name) {
        return name+"作文正文--我是中学生 睡觉贼厉害";
    }
}
