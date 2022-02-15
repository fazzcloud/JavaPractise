package com.hundred.if_test;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/14 14:17
 * @Description: 手握日月摘星辰，世间无我这般人
 */

import java.util.Scanner;

/**
 * 练习10：由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else)，并且从小到大输出。
 */
public class Practice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数");
        System.out.println("num1=");
        int num1 = scanner.nextInt();
        System.out.println("num2=");
        int num2 = scanner.nextInt();
        System.out.println("num3=");
        int num3 = scanner.nextInt();
        int min1 = 0;
        int min2 = 0;
        int min3 = 0;

        if (num1 < num2 && num2 < num3){
            min1 = num1;
            if (num2 < num3){
                min2 = num2;
                min3 = num3;
            }else {
                min2 = num3;
                min3 = num2;
            }
        }
        else if (num2 < num1 && num1 < num3){
            min1 = num2;
            if (num1 < num3){
                min2 = num1;
                min3 = num3;
            }else {
                min2 = num3;
                min3 = num1;
            }
        }
        else {
            min1 = num3;
            if (num1 < num2){
                min2 = num1;
                min3 = num2;
            }else {
                min2 = num2;
                min3 = num1;
            }
        }

        System.out.println("输入的三个整数为："+num1+" "+num2+" "+num3);
        System.out.println(min1+" "+min2+" "+min3);
        scanner.close();
    }
}
