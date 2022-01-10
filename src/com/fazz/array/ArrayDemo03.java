package com.fazz.array;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/10 13:43
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //打印数组的元素
        for (int i = 0;i < arrays.length;i++) {
            System.out.println(arrays[i]);
        }

        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum = sum + arrays[i];
        }
        System.out.println("sum num is:"+sum);

        //找出最大的元素
        int max = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > sum){
                sum = arrays[i];
            }
        }
        System.out.println("max num is:"+max);


    }
}
