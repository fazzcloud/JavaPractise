package com.oop.demo06;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/11 20:18
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Ault extends Everyone{
    @Override
    public void run() {
        System.out.println("run-->son"); //子类方法重写父类
    }

    public void eat(){
        System.out.println("eat");
    }
}
 /*
  public static void main(String[] args) {

        //Everyone 能调用的方法都是自己的或继承父类的
        Everyone a1 = new Ault();
        //Ault 父类型，可以指向子类，但是不能调用子类独有的方法
        Ault a2 = new Ault();

        //对象能执行哪些方法和左边类型有关，和右边关系不大
        a1.run();
        a2.run();
        //a1.eat();


    }
  */
