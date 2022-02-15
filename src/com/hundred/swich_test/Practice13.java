package com.hundred.swich_test;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/15 10:47
 * @Description: 手握日月摘星辰，世间无我这般人
 */
/*
练习2：输入 2022 年的某个月份和日期，例如 month=4，day=21，经过程序计算，打印出输入的月份和日期是 2022年的第几天：31+28+31+21
 */
public class Practice13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("请输入日期：");
        int day = scanner.nextInt();

        switch(month){
            case 1:
                System.out.println("今天是2022年第"+day+"天");
                break;
            case 2:
                System.out.println("今天是2022年第"+(day+31)+"天");
                break;
            case 3:
                System.out.println("今天是2022年第"+(day+31+28)+"天");
                break;
            case 4:
                System.out.println("今天是2022年第"+(day+31+28+31)+"天");
                break;
            case 5:
                System.out.println("今天是2022年第"+(day+31+28+31+30)+"天");
                break;
            case 6:
                System.out.println("今天是2022年第"+(day+31+28+31+30+31)+"天");
                break;
            case 7:
                System.out.println("今天是2022年第"+(day+31+28+31+30+31+30)+"天");
                break;
            case 8:
                System.out.println("今天是2022年第"+(day+31+28+31+30+31+30+31)+"天");
                break;
            case 9:
                System.out.println("今天是2022年第"+(day+31+28+31+30+31+30+31+31)+"天");
                break;
            case 10:
                System.out.println("今天是2022年第"+(day+31+28+31+30+31+30+31+31+30)+"天");
                break;
            case 11:
                System.out.println("今天是2022年第"+(day+31+28+31+30+31+30+31+31+30+31)+"天");
                break;
            case 12:
                System.out.println("今天是2022年第"+(day+31+28+31+30+31+30+31+31+30+31+30)+"天");
                break;

        }
        scanner.close();
    }
}
