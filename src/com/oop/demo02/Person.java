package com.oop.demo02;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/11 10:41
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Person {
    //一个类即使什么都不写，也会存在一个方法
    //显示的定义构造器
    String name;

    //实例化初始值
    //1.使用new关键字，本质是在调用构造器
    //2.用来初始化值
    public Person(){
    }

    //有参构造：一旦定义了有参构造，无参就必须显示定义，否则无效
    public Person(String name){
        this.name = name;
    }

}
/*
    public static void main(String[] args) {
        //new 实例化一个对象
        Person person = new Person();

        System.out.println(person.name);

    }
    构造器：
        1.和类名相同
        2.没有返回值
    作用：
        1.new 本质在调用构造方法
        2.初始化对象的值
    注意点：
        1.定义有参构造之后，如果想用无参构造，显示的定义一个无参构造
    Alt + insert

    this.表示当前类的，=后面的是传进来的值
 */
