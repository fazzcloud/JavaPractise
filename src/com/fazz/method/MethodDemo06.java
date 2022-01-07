package com.fazz.method;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 14:49
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class MethodDemo06 {
    public static void main(String[] args) {
        int a = F(3);
        System.out.println(a);

    }

    //递归解决阶乘
    public static int F(int i){
        int sum = 0;
        if (i == 1){ //递归一定要设置边界值，否则会一直循环
            return 1;
        }
        else {
            sum = i * F(i-1);
        }
        return sum;
    }
    //要活用递归的算法思想，在合适的情况下使用递归
}
