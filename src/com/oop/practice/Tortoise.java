package com.oop.practice;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/12 16:56
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//定义子类：乌龟，继承宠物类
public class Tortoise extends Animal{
    private int number;
    private int price;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override//实现抽象方法（本宠物总价计算：单价 * 数量）
    public int calcPrice() {
        int sumPrice = this.number * this.price;
        return sumPrice;
    }

    //计算猪鼻龟的本次数量的价格
    public int FinalPriceA(int number){
        int finalPrice;
        this.setName("猪鼻龟");
        this.setNumber(number);//接收数量
        this.setPrice(50);
        finalPrice = this.calcPrice();//调用重写的父类方法
        return finalPrice;
    }
    //计算金钱龟的本次数量的价格
    public int FinalPriceB(int number){
        int finalPrice;
        this.setName("金钱龟");
        this.setNumber(number);
        this.setPrice(30);
        finalPrice = this.calcPrice();
        return finalPrice;
    }
}
