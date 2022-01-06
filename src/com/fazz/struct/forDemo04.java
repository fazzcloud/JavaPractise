package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 7:13
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class forDemo04 {
    //九九乘法表
    public static void main(String[] args) {
        //1.输出第一列，第一列中1是不变的，第二个乘数需要循环增加
        //2.若想要输出剩下列，这里需要将1替换成动态循环
        //3.去掉重复项，i <= j;
        //4.优化样式--加\t--换行（输出换成print，再每次输出完后增加换行）
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(j + "*" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }

    }
}
