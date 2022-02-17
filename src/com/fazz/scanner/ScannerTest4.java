package com.fazz.scanner;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/19 21:20
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ScannerTest4 {
    public static void main(String[] args) {
        Scanner scanner =   new Scanner(System.in);

        //定义一个和
        double sum = 0;
        //定义输入了多少个数字
        int m = 0;

        System.out.println("请输入数字:");
        //通过循环判断是否还有输入，并且对每一次进行求和统计
        while(scanner.hasNextDouble()){  //若输入的不是数字则为结束循环
            double x = scanner.nextDouble();
            m = m + 1; //输入数字+1
            sum = sum + x; //更新总和，累加
            System.out.println("你输入了第"+m+"个数，当前结果为sum = "+sum);
        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值为" + (sum/m));
        scanner.close();
    }
}
