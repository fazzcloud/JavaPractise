package com.oop.practice;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/12 16:59
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//定义超市入口类
public class Test {
    public static void main(String[] args) {
        //实例化Scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("please choose your pet:a || b");

        //接收输入，判断是否选择乌龟
        String style = scanner.nextLine();
        if ("a".equals(style)||"A".equals(style)){
            //实例化乌龟对象
            Tortoise pet = new Tortoise();
            //通过子类调用父类，输入宠物的名称
            pet.setName("Tortoise");
            System.out.println("your pet is："+pet.getName());
            //接收购买宠物的数量
            System.out.println("please choose number:");
            pet.setNumber(scanner.nextInt());
            System.out.println("your number is:"+pet.getNumber());
            //调用方法设置乌龟的价格为50元
            pet.setPrice(50);
            System.out.println("please pay money:"+pet.calcPrice());
        }







    }
}
