package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 7:27
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class BreakDemo01 {
    //break会结束当前循环
    public static void main(String[] args) {
        int i = 0;

        while (i < 100){
            i++;
            if (i == 50){
                break;
            }
        }
        System.out.println(i+"结束循环！");
    }
}
