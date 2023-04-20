package com.ywt.desigen.template.demo.original;

import com.ywt.desigen.template.demo.last.Student;

/**
 * @Auther:yuanwt
 * @Date:2023-04-19 - 04 - 19 - 16:04
 * @Description: 作文标题、开头、结尾一致，只有正文需要自己写（即代码多处需要，只有部分不一样）
 * @Version: 1.0
 */
public class MiddleStusent {
    private String name;

    public void write() {
        System.out.println("我是标题");
        System.out.println("我是开头");
        //代码重复度较高，仅正文不要一样，其他都要一样
        System.out.println("我是中学生" + name + "正文");
        System.out.println("我是结尾");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
