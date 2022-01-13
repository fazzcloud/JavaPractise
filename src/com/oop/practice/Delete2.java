package com.oop.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/13 16:45
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Delete2 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("aabbbcc ddaaaffggbb");
        List lists = new ArrayList<>();
        for (int i = 0;i < buffer.length();i++){
            if (!lists.contains(buffer.charAt(i))){
                lists.add(buffer.charAt(i));
                buffer.append(buffer.charAt(i));
            }
        }
        System.out.println(buffer);
    }
}
