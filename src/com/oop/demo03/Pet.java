package com.oop.demo03;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/11 11:16
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//实例化对象
public class Pet {
    public String name;
    public int age;
    public String shot;

    public Pet() {
    }

    public void shot(){
        System.out.println("叫了一声");
    }
}
/*
public static void main(String[] args) {
        Pet dog = new Pet();

        dog.name = "小黄";
        dog.age = 3;
        dog.shot();

        System.out.println(dog.name);
        System.out.println(dog.age);

        Pet cat = new Pet();
    }
 */
