package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 10:12
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class StructTestDemo01 {
    //打印三角形,5行
    //按照图形拆分的思路，先将正方形拆成两个三角形，再将三角形反转
    public static void main(String[] args) {

        for (int j = 1;j <= 5;j++){ //循环五次也就是五行
            for (int i = 5; i >= j; i--) {//每一行递减
                System.out.print(" ");
            }
            for (int i = 1;i <= j;i++){
                System.out.print("*");
            }
            for (int i = 1;i < j;i++){//第一行不输出
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
