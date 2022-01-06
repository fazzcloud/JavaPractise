package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/6 17:25
 * @Description: 手握日月摘星辰，世间无我这般人
 */public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        do { //一定会执行
            sum = sum + i;
            i++;
        }while (i <= 100); //当i满足条件，循环结束

        System.out.println(sum);
    }
}

