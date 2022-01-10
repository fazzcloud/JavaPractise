package com.fazz.array;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/10 14:26
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        //多维数组：每一个元素都是一个数组，如下：
        /*
        1,2
        3,4
        5,6
        7,8
         */
        //可以理解为四行两列
        int[][] a = {{1,2},{3,4},{5,6},{7,8}};

        printArray(a[0]);
        System.out.println(a[0][1]);

        //获取数组长度
        System.out.println(a.length);
        System.out.println(a[0].length);
    }

    //打印数组
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }
}
