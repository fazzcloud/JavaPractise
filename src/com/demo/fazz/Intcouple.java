package com.demo.fazz;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/6 21:20
 * @Description: 定义一个数组，动态赋值后，反转输出
 */
public class Intcouple {
    public static void main(String[] args) {
        int [] arr = new int[3]; //动态赋值数组并将数组初始化为长度3
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        //逆序遍历数组arr
        for ( int i = arr.length - 1;i >= 0;i--  ){
            System.out.println(arr[i]+"");
        }

    }


    }

