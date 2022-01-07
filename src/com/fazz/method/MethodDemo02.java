package com.fazz.method;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 11:30
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class MethodDemo02 {
    public static void main(String[] args) {
        int max = Max(2,2);
        System.out.println(max);
    }
    //比大小
    public static int Max(int a,int b){
        int max = 0;
        if (a == b){
            System.out.println("a == b");
            return 0;//return除了返回值外，还用于终止方法。
        }
        else if (b > a){
            max = b;
        }
        else {
            max = a;
        }
        return max;
    }
}
