package com.fazz.base;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/9 19:59
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Base2 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i; //i超过了byte最大值，所以这里会内存溢出

        //强制转换 （类型）变量名 高→低
        //自动转换 低→高

        /*
        注意点：
        1.不能对布尔值转换
        2.不能把对象类型转换为不相干的类型
        3.在把高容量转换到低容量时，强制转换
        4.转换的时候，可能存在内存溢出或者精度的问题
         */

        System.out.println((int)23.7);
        System.out.println((int)45.26f);

        char c = 'a';
        int d = c + 1;
        System.out.println(d); //由于c是字符，+1时会根剧Unicode编码，输出数字
        System.out.println((char)d); //相当于将Unicode编码，转换为字符
    }
}
