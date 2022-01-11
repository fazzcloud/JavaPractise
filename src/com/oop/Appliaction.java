package com.oop;

import com.oop.demo03.Pet;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/11 10:14
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//一个项目只有一个main方法
public class Appliaction {
    public static void main(String[] args) {
        Pet dog = new Pet();

        dog.name = "小黄";
        dog.age = 3;
        dog.shot();

        System.out.println(dog.name);
        System.out.println(dog.age);

        Pet cat = new Pet();
    }

}

