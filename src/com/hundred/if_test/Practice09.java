package com.hundred.if_test;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/12 19:27
 * @Description: 手握日月摘星辰，世间无我这般人
 */

import java.util.Scanner;

/**
 * 练习09：
 *
 * 如果今天是周日且晴天，就出去嗨
 *
 * 如果今天是周日但不是晴天，睡懒觉
 *
 * 如果今天不是周日，继续996
 *
 * 说明：天气、星期几的变量，自己定义即可；主要练习if嵌套
 */
public class Practice09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入今天是周几:");
        String weekday = scanner.nextLine();
        System.out.println("请输入今天是什么天气:");
        String weather = scanner.nextLine();

        if ( weekday.equals("sunday")){
            if (weather.equals("sunning")){
                System.out.println("出去嗨");
            }else {
                System.out.println("睡懒觉");
            }
        }
        else {
            System.out.println("继续996");
        }
    }
}
