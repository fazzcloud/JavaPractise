package com.oop.practice;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/12 16:57
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//定义子类：金鱼，继承宠物类
public class GoldFish extends Animal{
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
        int sumPrice = number * price;
        return sumPrice;
    }

    //计算红龙眼金鱼的本次数量的价格
    public int FinalPriceA(int number){
        int finalPrice;
        this.setName("红龙眼金鱼");
        this.setNumber(number);//接收数量
        this.setPrice(10);
        finalPrice = this.calcPrice();//调用重写的父类方法
        return finalPrice;
    }
    //计算紫龙睛金鱼的本次数量的价格
    public int FinalPriceB(int number){
        int finalPrice;
        this.setName("紫龙睛金鱼");
        this.setNumber(number);
        this.setPrice(20);
        finalPrice = this.calcPrice();
        return finalPrice;
    }
}
