package com.fazz.demo;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/8 7:38
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Avgscore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //定义总分，初始值为0
        int Totalscore = 0;

        //i为课程数，score为课程分数，循环输入三次，最后得到总分
        for(int i = 1;i <= 3;i++){
            System.out.println("请输入第"+i+"门课程成绩。");
            float score = input.nextFloat();
            Totalscore += score;
        }

        //算出平均分
        float avgscore = Totalscore/3;
        System.out.println("你的平均分为："+avgscore+"分。");
    }
}
