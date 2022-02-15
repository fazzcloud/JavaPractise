package com.hundred.base;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/10 10:21
 * @Description: 手握日月摘星辰，世间无我这般人
 */

/**
 * 练习1：判断输入的值是否是偶数，另外，要处理输入错误
 */
public class Practice01 {
    public static void main(String[] args) {
        System.out.print("请输入一个整数：");
        //实例化scanner对象
        Scanner scanner = new Scanner(System.in);
        //使用while循环判断，输入的是否为整数，若不为整数则给出提示
        while(!scanner.hasNextInt()){
            //接收输入，否则会死循环
            scanner.next();
            System.out.println("输入错误，请重新输入！");
            System.out.print("请输入一个整数：");
        }
        //若输入为整数，则接收整数，并打印结果
        int scanner_input = scanner.nextInt();
        if (scanner_input % 2 == 0){
            System.out.println(scanner_input+"是偶数");
        }else {
            System.out.println(scanner_input+"是奇数");
        }
        //关闭scanner对象
        scanner.close();
    }
}
