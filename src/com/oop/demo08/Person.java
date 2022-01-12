package com.oop.demo08;

//静态导入包
/**
 * @Author: Fazzcloud
 * @Date: 2022/1/12 15:51
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//匿名代码块
public class Person {
    {
        System.out.println("static");
    }
    static { //只执行一次，创建对象时，首先执行
        System.out.println("static2");
    }

    public Person(){
        System.out.println("static3");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
    }
}
