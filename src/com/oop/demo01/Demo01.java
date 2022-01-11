package com.oop.demo01;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/10 20:26
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Demo01 {
    public static void main(String[] args) {

    }

    /*
    修饰符  返回值类型  方法名（....）｛
        方法体
        return 返回值；
    ｝
     */
    public String sayHello(){
        return "hello,world!";
    }

    public void hello(){
        return;
    }

    public int max(int a,int b){
        return a>b? a: b; //三元运算符
    }
}
