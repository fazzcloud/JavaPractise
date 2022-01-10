package com.fazz.method;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 15:13
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class MathTest01 {
    public static void main(String[] args) {
        //写出四个方法，可选择计算方法，进行加减乘除运算

        //while(true)无限循环
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请选择需要进行的计算：");
            System.out.println("a：加法");
            System.out.println("b：减法");
            System.out.println("c：乘法");
            System.out.println("d：除法");

            String choose = scanner.nextLine();//接受用户的选择

            //根剧接受的输入判断算法
            switch(choose){

                //没有输入数字，默认提示
                default:
                    System.out.println("请重新选择。");
                    break;
                //根据选择调用对应方法
                case "a":
                    System.out.println("请输入两个数：");
                    int a1 = scanner.nextInt();
                    int a2 = scanner.nextInt();
                    Add(a1,a2);
                    break;
                case "b":
                    System.out.println("请输入两个数：");
                    int b1 = scanner.nextInt();
                    int b2 = scanner.nextInt();
                    Subduction(b1,b2);
                    break;
                case "c":
                    System.out.println("请输入两个数：");
                    int c1 = scanner.nextInt();
                    int c2 = scanner.nextInt();
                    Multiplication(c1,c2);
                    break;
                case "d":
                    System.out.println("请输入两个数：");
                    double d1 = scanner.nextInt();
                    double d2 = scanner.nextInt();
                    Division(d1,d2);
                    break;
            }

            System.out.println("是否需要继续计算？Y/N");
            String result = scanner.next();
            //根剧接受的输入判断是否结束循环
            if ( "N".equals(result) || "n".equals(result)){
                scanner.close();
                System.out.println("bye~");
                break;
            }
        }


    }

    //定义一个加法方法
    public static void Add(int... addNum){
        if (addNum.length == 0){
            System.out.println("输入的数字为空！");
            return;//没有返回值的方法，return后面不需要加上值
        }

        int addSum = 0;

        for (int i = 0;i < addNum.length;i++){
            addSum = addSum + addNum[i];
        }
        System.out.println("两个数相加的结果为:"+addSum);
    }

    //定义一个减法
    public static void  Subduction(int...  subductionNum){
        int subductionSum = 0;
        if (subductionNum.length == 0){
            System.out.println("输入的数字为空！");
            return ;
        }
        else {
            subductionSum = subductionNum[0] - subductionNum[1];
        }
        System.out.println("两个数相减的结果为："+subductionSum);
    };

    //定义一个乘法
    public static void Multiplication(int... multiplicationNum){
        int multiplicationSum = 1;
        if (multiplicationNum.length == 0){
            System.out.println("输入的数字为空！");
            return ;
        }

        for (int i = 0; i < multiplicationNum.length  ; i++) {
            multiplicationSum  = multiplicationNum[i] * multiplicationSum;
        }
        System.out.println("两个数相乘的结果为："+ multiplicationSum);
    }

    //定义一个除法
    public static void Division(double... divisionNum){
        double divisionSum = 1.0;
        if (divisionNum.length == 0){
            System.out.println("输入的数字为空！");
            return ;
        }

        for (int i = 0; i < divisionNum.length ; i++) {
            divisionSum  = divisionNum[i] / divisionSum;
        }
        System.out.println("两个数相除的结果为："+ divisionSum);
    }

}
