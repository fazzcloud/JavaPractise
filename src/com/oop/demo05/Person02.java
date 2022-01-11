package com.oop.demo05;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/11 15:16
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//java中所有的类，都直接或间接继承object类
public class Person02 {
    //一般属性都是隐藏的，一般都是继承方法
    private int age;
    protected String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("1");
    }
}
/*
    public static void main(String[] args) {
        Student03 stu2 = new Student03();
        Teacher teacher = new Teacher();

        //继承Person02父类的方法
        stu2.setName("fazz");
        System.out.println("学生的姓名为："+stu2.getName());
        teacher.setName("teacher");
        System.out.println("老师的姓名为："+teacher.getName());


    }
 */
