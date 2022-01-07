package com.fazz.method;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 13:44
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class MethodDemo03 {
    //方法重载
    public static void main(String[] args) {
        int minnum = Min(1,2); //调用方法
        System.out.println(minnum+"====");

        int minnum2 = Min(1,2,3);
        System.out.println(minnum2+"++++");

        Min();

    }

    public static void Min(){
        System.out.println("请输入需要对比的数字！");
    }

    public static int Min(int a,int b){
        int min = 0;
        if (a == b){
            System.out.println("两个数都相等");
            return 0;
        }
        else if (a < b){
            min = a;
        }
        else {
            min = b;
        }
        return min;
    }

    public static int Min(int a,int b,int c){
        int min = 0;
        if (a == b && b == c){
            System.out.println("三个数都相等");
            return 0;
        }
        else if (a < b && a < c){
            min = a;
        }
        else if (b < a && b < c){
            min = b;
        }
        else {
            min = c;
        }
        return min;
    }


}
