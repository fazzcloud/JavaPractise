package com.fazz.struct;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/27 7:24
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class IfDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println("请输入成绩：");

        if (score == 100){
            System.out.println("s");
        }
        else if (score < 100 && score >= 90){
            System.out.println("a");
        }
        else if (score < 90 && score >= 70 ){
            System.out.println("b");
        }
        else if (score <70 && score >= 60){
            System.out.println("c");
        }
        else if (score < 60){
            System.out.println("不及格");
        }
        else {
            System.out.println("非法数据");
        }
        scanner.close();
    }
}
