package com.oop.demo02;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/11 10:13
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//学生类
public class Student {
    //属性：字段
    String name;
    int age;

    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }

}
/* 测试类
    //类是抽象的，需要实例化
        //类实例化之后会返回一个自己的对象
        //student对象就是一个Student类的具体实例

        Student student = new Student();
        Student xiaoming = new Student();
        Student xiaohong = new Student();

        //上面这些都是Student类的具体实例，也就是对象，他们都拥有Student类中的属性
        System.out.println(xiaoming.name);//String类型的属性，没有赋值时，默认为null

        xiaoming.name = "xm";
        xiaoming.age = 12;
        System.out.println("学生名字为："+xiaoming.name);//赋值后，对象的属性会拥有具体的值
        System.out.println("学生年龄为："+xiaoming.age);
 */
