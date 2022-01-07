package com.fazz.method;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 10:42
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class MethodDemo01 {
    //main方法
    public static void main(String[] args) {
        //调用方法
        //实参：实际参数，实际调用传递给他的参数
        int sum = Add(1,2);
        System.out.println(sum);
        System.out.println("==================");
        //调用方法
        Test01();
    }


    //定义一个加法计算的方法
    //形参：形式参数，用来定义作用的
    public static int Add(int a,int b){ //static可使传参变为类变量，int为定义返回数据的类型
        return a+b;//有返回值的方法一定要有return
    }
    //定义一个没有返回值的方法(输出1~1000之间能被5整除的数，并且每行输出3个)
    public static void Test01(){
        for (int i = 1; i < 1000; i++) {
            if (i % 5 == 0){
                System.out.print(i+"\t"); //"\t"是用table键分隔
            }

            if (i % 15 == 0){
                System.out.println(); //输出空即为换行
            }

        }
    }

}
