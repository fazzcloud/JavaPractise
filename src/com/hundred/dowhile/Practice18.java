package com.hundred.dowhile;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/17 9:13
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Practice18 {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i);
            i--;
        }while (i>5);
        //结果应该是5，因为先运行do里面的代码，再进行判断
    }
}
