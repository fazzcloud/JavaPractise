package com.hundred.while_test;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/16 9:45
 * @Description: 手握日月摘星辰，世间无我这般人
 */
/*
练习3：循环提示用户输入一个非零整数，直到输入数字0为止，然后输出其中的最大值和最小值
 */
public class Practice16 {
    public static void main(String[] args) {
        //不需要记录每一个数，每次循环时对比最大最小值，记录最大最小值即可
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 100;
        while (true){
            System.out.println("请输入一个非0整数(输入0退出)：");
            int num = scanner.nextInt();
            if ( num!=0){
                if (num>max){
                    max = num;
                }
                if (num < min){
                    min = num;
                }
            }else {
                System.out.println("exit!");
                break;
            }
        }
        System.out.println("max:"+max);
        System.out.println("min:"+min);
        scanner.close();
    }
}
