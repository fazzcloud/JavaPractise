package com.hundred.dowhile;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/17 9:15
 * @Description: 手握日月摘星辰，世间无我这般人
 */
/*
练习2：打印输出 [0,200] 之间所有能被7整除，但不能被4整除的所有整数，要求每行打印5个，并统计个数
 */
public class Practice19 {
    public static void main(String[] args) {
        int count = 0;//记录统计数量
        int num = 0;//记录数字
        do {
            num++;
            if (num % 7 == 0 && num % 4 != 0){
                System.out.print(num+" ");
                count++;
                if (count % 5 == 0){ //每五个数字就换行输出
                    System.out.println();
                }
            }
        }while (num >= 0 && num <= 200);
        System.out.println();
        System.out.println("总个数为："+count);
    }
}
