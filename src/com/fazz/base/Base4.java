package com.fazz.base;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/9 20:22
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Base4 { //类
    //属性：变量

    //类变量：static
    static double salary = 2500;

    //实例变量：从属于对象;非必须初始化值；如果不自行初始化，数字类型的默认值为0或0.0
    //布尔值默认为false
    //除了基本类型，其余的默认值都是null;
    String sex;
    int age;

    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值
        int a = 1;
        String name = "fazz";

        //使用实例变量：变量类型 变量名字  = new Demo5（）；
        Base4 base4 = new Base4();
        System.out.println(base4.sex);
        System.out.println(base4.age);

        //类变量可以直接调用
        System.out.println(salary);
    }


    //其他方法
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
