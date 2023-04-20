package com.ywt.desigen.template.demo.last;

/**
 * @Auther:yuanwt
 * @Date:2023-04-19 - 04 - 19 - 15:48
 * @Description: 学生抽象类，描述学生
 * @Version: 1.0
 */
public abstract  class Student {
    private String name;

    /**
     *  作文标题、开头、结尾一致，只有正文需要自己写（即代码多处需要，只有部分不一样）
     */
    public void write(){
        System.out.println("我是标题");
        System.out.println("我是开头");
        System.out.println(writeMain(name));
        System.out.println("我是结尾");
    }

    //抽象方法写正文
    public abstract String writeMain( String name);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
