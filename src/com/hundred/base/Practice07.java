package com.hundred.base;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/11 11:25
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Practice07 {
    public static void main(String[] args) {
        //下面的题目结果是什么，为什么
        int a = 97;
        //char b = a;
        //System.out.println(b);
        //这里会报错，已经定义了a是整数（数字类型），b是字符串，不可以将整数传给字符串

        int m = 3;
        int n = m++ + ++m; // 4 + 4，m++是先计算再累加，++m是先累加再计算
        System.out.println("m:"+m+", n:"+n); //5，8,

        char c = 97;//本质都是二进制的数字，97在二进制中对应了a
        System.out.println(c);
    }
}
