package com.fazz.array;

import java.util.Arrays;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/10 15:28
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] arrays = {11,22,33,44,55};
        //输出数组
        System.out.println(Arrays.toString(arrays));
        //排序,升序
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
