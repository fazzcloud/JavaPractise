package com.oop.demo08;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/12 15:39
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//static
public class Student {
    private static String name; //静态变量
    private int age; //非静态变量

    public void go(){
        //静态方法
    }

    public static  void run(){
        //静态方法
    }

    public static void main(String[] args) {
        // Student student1 = new Student();
        //
        // System.out.println(student1.name); //调用变量name
        // System.out.println(student1.age);
        // System.out.println(Student.name);
        //System.out.println(Student.age);  非静态变量，不可以用类直接调用，只可以用对象调用

        run();
        Student.run(); //带static关键字的，不需要实例化对象，可以直接调用

        new Student().go(); //没有static关键字，则需要实例化对象后，才可以调用


    }
}
