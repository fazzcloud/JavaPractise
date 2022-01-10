package com.fazz.array;

import java.util.Arrays;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/10 15:45
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ArrayTestDemo01 {
    //冒泡排序
    public static void main(String[] args) {
        int[] a = {46,431,28,67,97,46,14,31,68};
        int[] b = MySord(a);
        System.out.println(Arrays.toString(b));

    }

    public static int[] MySord(int[] arrays){
        int temp = 0;//定义一个临时变量
        //外层循环，判断要循环多少次
        for (int i = 0;i < arrays.length;i++){
            boolean flag = false;

            //内层循环，比较两个数，若后者比前者大，则交换位置
            for (int j = 0;j < arrays.length-1-i;j++){
                if (arrays[j] < arrays[j+1]){
                    temp = arrays[j+1];
                    arrays[j+1] = arrays[j];
                    arrays[j] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
        return arrays;
    }
}
