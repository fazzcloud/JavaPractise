package com.oop.practice;

import java.util.Arrays;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/13 16:37
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Middle {
    public static void main(String[] args) {
        int a[] = new int[]{1, 5, 4, 5, 5, 5, 5}; //定义一个数组
        Arrays.sort(a); //给数组排序
        int count = 0; //定义当前数重复的次数
        int mid = a.length / 2; //mid为数组的中间位置

        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[mid]) {
                count++;
            }
        }
        if (count > mid) {
            System.out.println("number is :" + a[mid]);
        } else {
            System.out.println(0);
        }
    }
}
