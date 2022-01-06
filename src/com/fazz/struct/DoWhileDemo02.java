package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/6 17:30
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class DoWhileDemo02 {
    public static void main(String[] args) {
        //while和do ..while的区别
        int a = 0;

        //先用while进行测试
        while(a < 0){
            System.out.println("a");
        }

        System.out.println("=============");

        //再用do...while进行测试
        do {
            System.out.println("b");
        }while (a < 0);

        //这里会发现由于while是先判断，所以不会输出“a”，循环结束
        //do..while是先执行,所以会先输出“b”，然后结束循环

    }
}
