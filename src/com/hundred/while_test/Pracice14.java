package com.hundred.while_test;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/16 9:31
 * @Description: 手握日月摘星辰，世间无我这般人
 */
/*
练习1：输出比i（i=5）小的正整数
 */
public class Pracice14 {
    public static void main(String[] args) {
        int i = 5;
        //从5开始，递减，若为0则结束循环
        while (i<=5){
            System.out.println(i);
            i--;
            if (i==0){
                break;
            }
        }
    }
}
