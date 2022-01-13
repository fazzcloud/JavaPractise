package com.oop.practice;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/13 16:45
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Delete2 {
    public static void main(String[] args) {
        String s = "aabbbcc ddaaaffggbb";
        Delete2 sctrl = new Delete2();
        System.out.println(sctrl.rmRepeated(s));
    }

    /*
     * 清除字符串中重复字母算法
     */
    String rmRepeated(String s){
        int len = s.length();
        int k = 0;
        int count = 0;
        String str = "";
        char[] c = new char[len];
        for(int i=0;i<len;i++){
            c[i] = s.charAt(i);
        }
        for(int i=0;i<len;i++){
            k=i+1;
            while(k<len-count){
                if(c[i]==c[k]){
                    for(int j=k;j<len-1;j++){
                        c[j] = c[j+1];//出现重复字母，从k位置开始将数组往前挪位
                    }
                    count++;//重复字母出现的次数
                    k--;
                }
                k++;
            }

        }
        for(int i=0;i<len-count;i++){
            str+=String.valueOf(c[i]);
        }
        return str;

    }
}
