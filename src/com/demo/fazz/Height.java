package com.demo.fazz;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/8 7:06
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Height {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的身高(m):");
        float height = input.nextFloat();
        System.out.println("你的身高为:"+height);

        if (height > 1.8){
            System.out.println("高");
        }
        else {
            System.out.println("正常");
        }

        System.out.println("请输入今天是周几(整数):");
        int week = input.nextInt();

        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            default:
                System.out.println("休息日");
        }

    }
}
