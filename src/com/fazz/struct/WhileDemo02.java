package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/6 17:15
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class WhileDemo02 {
    public static void main(String[] args) {
        //计算1+2+3+...+100
        int i = 0;
        int sum = 0;

        while (i <= 100){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
