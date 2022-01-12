package com.oop.demo09;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/12 16:01
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//abstract 抽象类
public abstract class Action {
    //抽象类中方法是受约束的，由子类去实现
    //抽象方法只有方法名，没有方法的实现！
    public abstract void DoSomthing();

    /*
    总结：
    1.抽象类不可以实例化对象，也就是不可以用new关键字，只能靠子类去实现
    2.抽象类中可以写普通方法；抽象方法必须要在抽象类中
     */
}
