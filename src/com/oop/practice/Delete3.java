package com.oop.practice;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/13 16:33
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Delete3 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("aabbcdeefg");

        for (int i = buffer.length() - 1 ;i >= 0;i--){
            if (i % 3 == 0){
                buffer.deleteCharAt(i);
            }
        }
        System.out.println(buffer);
    }
}
