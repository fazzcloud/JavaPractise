package com.hundred.while_test;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/16 10:04
 * @Description: 手握日月摘星辰，世间无我这般人
 */
/*
练习4：从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
 */
public class Practice17 {
    public static void main(String[] args) {
        //思路类似，不需要记录每个输入的数，比较后记录个数即可
        Scanner scanner = new Scanner(System.in);
        int count_zhengshu = 0;
        int count_fushu = 0;
        while (true){
            System.out.println("请输入整数（输入0退出）：");
            int num = scanner.nextInt();

            if (num > 0){
                count_zhengshu++;
            }
            else if (num < 0){
                count_fushu++;
            }
            else {
                break;
            }
        }
        System.out.println("正数个数："+count_zhengshu);
        System.out.println("负数个数："+count_fushu);
        scanner.close();
    }
}
