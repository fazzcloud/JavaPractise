package com.fazz.array;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/10 11:19
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //变量类型 变量名字 = 变量的值
        //数组类型 数组名字 = 数组的值
        int[] numbers ; //声明
        numbers = new int[10]; //创建数组，这里面可以存放十个int类型的数字，也就是定义数组的长度

        //给数组中元素赋值
        numbers[0] = 1;
        //数组中int类型没赋值，默认为0
        System.out.println(numbers[1]);

        //计算所有元素的合
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = numbers[i] + sum;
        }
        System.out.println(sum);
    }
}
