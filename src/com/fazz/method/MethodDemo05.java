package com.fazz.method;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 14:06
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class MethodDemo05 {
    public static void main(String[] args) {
        //调用可变参数方法
        MaxNum(1,5,8,9);
        MaxNum();

    }

    public static void MaxNum(double... number){
        if (number.length == 0){
            System.out.println("number is null!");
            return; //结束方法
        }

        double maxnum = 0;

        for (int i = 0;i < number.length;i++){
            if (number[i] > maxnum){//从数组的第一个数开始遍历，只要比maxnum大，则将maxnum的值更新为那个数
                maxnum = number[i];
            }
        }
        System.out.println("max number is:"+maxnum);
    }
}
