package com.hundred.if_test;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/12 19:13
 * @Description: 手握日月摘星辰，世间无我这般人
 */

import java.util.Scanner;

/**
 * if：if...else...及if嵌套
 * 练习08：提示用户输入三个整数，判断并输出最大值、最小值
 */
public class Practice08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("请依次输入第一个整数：");
            int num_first = scanner.nextInt();
            System.out.println("请依次输入第二个整数：");
            int num_second = scanner.nextInt();
            System.out.println("请依次输入第三个整数：");
            int num_third = scanner.nextInt();
            int max = 0;
            int min = 0;
            if (num_first > num_second && num_first > num_third){
                max = num_first;
                System.out.println("最大值："+max);
            }
            else if (num_second > num_first && num_second > num_third){
                max = num_second;
                System.out.println("最大值："+max);
            }else {
                max = num_third;
                System.out.println("最大值："+max);
            }

            if (num_first < num_second && num_second < num_third){
                min = num_first;
                System.out.println("最小值："+min);
            }
            else if (num_second < num_first && num_first < num_third){
                min = num_second;
                System.out.println("最小值："+min);
            }else {
                min = num_third;
                System.out.println("最小值："+min);
            }
        scanner.close();
        }
    }

