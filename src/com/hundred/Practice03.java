package com.hundred;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/10 10:43
 * @Description: 手握日月摘星辰，世间无我这般人
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 练习3：从控制台获取Java、Oracle、HTML三门课程的成绩，计算总分和平均分
 */
public class Practice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("请输入java成绩：");
            int res_java = scanner.nextInt();
            System.out.println("请输入Oracle成绩：");
            int res_Oracle = scanner.nextInt();
            System.out.println("请输入HTML成绩：");
            int res_HTML = scanner.nextInt();
            float res_total = res_java + res_Oracle + res_HTML;
            float res_avg = res_total / 3;
            System.out.println("-------------------");
            System.out.println("Java Oracle HTML");
            System.out.println(res_java+" "+res_Oracle+" "+res_HTML);
            System.out.println("-------------------");
            System.out.println("总分："+res_total);
            System.out.println("平均分："+res_avg);
        }catch (InputMismatchException e){
            System.out.println("输入的不是数字请重新输入！");
        }
        scanner.close();




    }
}
