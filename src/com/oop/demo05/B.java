package com.oop.demo05;/**
 * @Author: Fazzcloud
 * @Date: 2022/1/11 17:09
 * @Description: 手握日月摘星辰，世间无我这般人
 */

//方法和重写和属性没有关系
public class B {
    public  void test03(){
        System.out.println("B==>TEST()");
    }
}
/*
    //方法的重写只针对非静态的方法
    public static void main(String[] args) {

        //方法的调用只和左边，也就是定义的数据类型有关
        A a = new A();
        a.test03();

        //父类的引用指向了子类
        B b = new A();
        b.test03();
    }

 */
