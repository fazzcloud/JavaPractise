package com.fazz.struct;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/27 7:14
 * @Description: if单选泽结构
 */
public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please intput word:");
        String s = scanner.nextLine();//接受输入的值，赋值给s

        if (s.equals("hello")){ //equals；判断字符串是否相等
            System.out.println(s);
        }
        System.out.println("End");//不为“hello”则输出“End”




        scanner.close();
    }
}
