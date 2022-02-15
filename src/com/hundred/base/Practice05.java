package com.hundred.base;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/11 10:22
 * @Description: 手握日月摘星辰，世间无我这般人
 */

import java.util.Scanner;

/**
 * 练习5：输入tom和jack的年龄，比较年龄并输出相差多少岁，要求使用条件运算符
 */
public class Practice05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入tom的年龄:");
        int tom_age = scanner.nextInt();
        System.out.println("请输入jack的年龄:");
        int jack_age = scanner.nextInt();
        /**
         * 条件运算符：
         * 表达式1？表达式2：表达式3
         * 先判断表达式1的值：
         *         若为真（1）则将表达式2的值做为整个表达式的值；
         *         若为假（0）则将表达式3的值做为整个表达式的值。
         */
        //定义变量接受差值
        int diff_age = tom_age > jack_age ? tom_age - jack_age : jack_age - tom_age;
        //根剧比较结果输出不同提示
        System.out.println(tom_age > jack_age ? "tom比jack大"+diff_age+"岁" : "jack比tom大"+diff_age+"岁");
        scanner.close();
    }
}
