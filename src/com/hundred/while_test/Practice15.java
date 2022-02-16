package com.hundred.while_test;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/16 9:41
 * @Description: 手握日月摘星辰，世间无我这般人
 */
/*
练习2：求1到100之间所有偶数的和
 */
public class Practice15 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        //当num<=100时，判断是否为偶数，每次循环递增
        while (num <= 100){
            if (num % 2 == 0){
                sum = sum + num;
            }
            num ++;
        }
        System.out.println(sum);
    }
}
