package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/6 7:00
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class SwitchDemo01 {
    public static void main(String[] args) {
        char grade = 'c';

        switch (grade){
            default:
                System.out.println("(默认)未知"); //匹配不到值，默认输出
            case 'a':
                System.out.println("优秀");
                break;//可选，若没有break，则会继续输出（case穿透）
            case 'c':
                System.out.println("优秀2");
                break;

        }
    }
}
