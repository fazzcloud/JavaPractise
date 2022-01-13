package com.oop;

import com.oop.demo11.Outer;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/11 10:14
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//一个项目只有一个main方法
public class Appliaction {
    public static void main(String[] args) {
        //实例化外部类
        Outer outer = new Outer();
        //通过这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        //测试方法打印
        inner.in();
    }
}

