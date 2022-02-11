package com.hundred;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/11 9:40
 * @Description: 手握日月摘星辰，世间无我这般人
 */

import java.util.Scanner;

/**
 * 练习4：输入一个数字，反转输出，如：输入123，输出321
 */
public class Practice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入：");
        int num = scanner.nextInt();
        //定义一个变量作为结果
        int res = 0;

        while (num != 0){
            int num_last = num % 10; //利用取余，将最后一位数字取出
            res = res * 10 + num_last;//将之前获取的数字升位，并加上新获取的数字，实现反转
            num = num / 10;//降位
        }
        System.out.println("输出:"+res);
    }
}
