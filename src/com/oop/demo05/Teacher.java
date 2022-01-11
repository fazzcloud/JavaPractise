package com.oop.demo05;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/11 15:17
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Teacher extends Person02{
    private String name;

    public void test(String name){
        System.out.println(name); //接受的参数name的值
        System.out.println(this.name); //当前类中属性name的值，默认为null
        System.out.println(super.name);//父类中的属性name（属性必须为可访问的）
    }

    public void print(){
        System.out.println("2");
    }

    public void test1(String name){
        print();//当前类的方法
        this.print();//当前类的方法
        super.print();//父类的方法

    }
}
/*
public static void main(String[] args) {
        Teacher tc1 = new Teacher();
        tc1.test("fazz");
        tc1.test1("3");

    }
 */
