package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 6:48
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class forDemo03 {
    //循环输出1~1000之间能被5整除的数，并且每行输出3个
    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            if (i % 5 == 0){
                System.out.print(i+"\t"); //"\t"是用table键分隔
            }

            if (i % 15 == 0){
                System.out.println(); //输出空即为换行
                //System.out.print("\n"); 或者使用print("\n")也可以换行
            }
            //println和print的区别是，前者会换行，后者不会
        }
    }
}
