package com.oop.demo11;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/13 16:57
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Outer {
    private int id;
    public void out(){
        System.out.println("这是外部类的方法");
    }
    public class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }

        //可以获得外部类的私有属性
        public void getID(){
            System.out.println(id);
        }
    }
}
/*
    public static void main(String[] args) {
        //实例化外部类
        Outer outer = new Outer();
        //通过这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        //测试方法打印
        inner.in();
    }
 */
