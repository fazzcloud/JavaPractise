package com.fazz.struct;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/27 7:20
 * @Description: If双选择结构
 */
public class IfDemo02 {
    public static void main(String[] args) {
        //考试分数大于60为及格，小于60为不及格
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = scanner.nextInt();

        if (score >= 60){
            System.out.println("及格");
        }
        else {
            System.out.println("不及格");
        }

        scanner.close();
    }
}
