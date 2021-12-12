package com.fazz.operator;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/12 20:09
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Operator6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(""+a+b); //输出的字符串在前，那么a+b不会计算
        System.out.println(a+b+"");//输出的字符串在后，那么a+b会被计算
    }
}
