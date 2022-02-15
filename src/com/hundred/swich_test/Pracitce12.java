package com.hundred.swich_test;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/15 10:32
 * @Description: 手握日月摘星辰，世间无我这般人
 */

/**
 * 练习1：周一跑步，周二、三、四打羽毛球，周五游泳，其它休息
 */
public class Pracitce12 {
    public static void main(String[] args) {
        int today = 4;
        switch (today){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("羽毛球");
                break;
            case 5:
                System.out.println("游泳");
                break;
            default:
                System.out.println("休息");
                break;
        }
    }
}
