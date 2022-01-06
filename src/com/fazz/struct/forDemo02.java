package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/7 6:44
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class forDemo02 {
    //练习1，计算0到100之间奇数和偶数的和
    public static void main(String[] args) {
        int jishu = 0;
        int oushu = 0;

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0){
                oushu = oushu + i;
            }
            else {
                jishu = jishu + i;
            }

        }
        System.out.println("偶数和为："+oushu);
        System.out.println("奇数和为："+jishu);
    }


}
