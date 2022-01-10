package com.fazz.array;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/10 11:50
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化:创建+赋值
        int[] a = {11,2,3,4};
        System.out.println(a[2]);

        //动态初始化:包含默认初始化
        int[] b = new int[5];
        b[0] = 20;
        System.out.println(b[0]);
    }
}
