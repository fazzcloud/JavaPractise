package com.oop.practice;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/12 16:52
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//抽象类：宠物
public abstract class Animal {
    //定义属性name（抽象类中属性必须是常量，所以要在子类中定义）
    protected String name;

    //定义抽象方法：calcPrice
    public abstract int calcPrice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
