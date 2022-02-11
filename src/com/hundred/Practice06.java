package com.hundred;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/11 10:55
 * @Description: 手握日月摘星辰，世间无我这般人
 */

import java.util.Scanner;

/**
 * 练习6：交换两个数值变量的值（至少两种方法）
 */
public class Practice06 {
    public static void change_1(int a,int b){
        //最简单思路，采用中间变量，
        System.out.println("第一种方法(采用中间变量)--------------");
        System.out.println("替换前的值为:a="+a+",b="+b);
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("替换后的值为:a="+a+",b="+b);
        System.out.println("----------------");
    }

    public static void change_2(int a,int b){
        //利用位运算符，进行数据交换
        //思路：一个数异或同一个数两次，结果还是那个数，而且不会超出int范围
        System.out.println("第二种方法(采用位运算符)--------------");
        System.out.println("替换前的值为:a="+a+",b="+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("替换后的值为:a="+a+",b="+b);
        System.out.println("----------------");
    }

    //主方法
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数，第一个数：");
        int a = scanner.nextInt();
        System.out.println("第二个数：");
        int b = scanner.nextInt();
        Practice06.change_1(a,b);
        Practice06.change_2(a,b);
    }

}
