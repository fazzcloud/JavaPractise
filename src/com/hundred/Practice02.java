package com.hundred;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/10 10:38
 * @Description: 手握日月摘星辰，世间无我这般人
 */

import java.util.Scanner;

/**
 * 练习2：输入并输出姓名、年龄、身高
 */
public class Practice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的年龄：");
        String age = scanner.nextLine();
        System.out.println("请输入你的身高：");
        String heigth = scanner.nextLine();
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("身高："+heigth);
        scanner.close();
    }
}
