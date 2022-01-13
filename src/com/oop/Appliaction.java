package com.oop;

import com.oop.demo11.Person;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/11 10:14
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//一个项目只有一个main方法
public class Appliaction {
    public static void main(String[] args) {
        Person fazz = new Person("fazz", 25);
        //调用Object类中的，getclass方法
        System.out.println(fazz.getClass());
        //类名.calss也可以实现
        System.out.println(Person.class);


    }
}

