package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 7:31
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ContinueDemo01 {
    //continue跳过本次循环，继续向下后面的循环
    public static void main(String[] args) {
        int i = 0;

        while (i <= 10){
            i++;
            if (i%2 == 0){ //遇偶数则跳过
                System.out.println();
                continue;
            }
            System.out.print(i);
        }
    }
}
