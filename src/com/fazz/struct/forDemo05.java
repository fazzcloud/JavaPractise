package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 7:23
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class forDemo05 {
    public static void main(String[] args) {
        int[] numbers = {1,10,20,30,40};

        for (int i = 0;i < 5;i++){//普通写法
            System.out.println(numbers[i]);
        }
        System.out.println("==============");

        //遍历数组中的元素，增强循环
        for (int x:numbers){
            System.out.println(x);
        }
    }
}
