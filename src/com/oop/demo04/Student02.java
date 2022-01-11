package com.oop.demo04;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/11 14:54
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Student02 {

    //属性私有
    private String name;
    private int age;
    private String sex;

    //提供可以操作属性的方法
    //提供一些public的get和set的方法

    //get是获取属性
    public String getName(){
        return name;
    }
    //set是设置值
    public void setName(String name){
        this.name = name; //方法里面的name指向当前class中的属性name
    }

    //alt + insert

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
/*
public static void main(String[] args) {
        Student02 stu1 = new Student02();
        stu1.setName("fazz"); //调用setName方法，传值
        System.out.println("学生1姓名为："+stu1.getName());//调用getName方法，获取值
    /*
    1.提高程序的安全性，保护数据
    2.隐藏代码实现的细节
    3.统一接口
    4.提高系统可维护性
     */
