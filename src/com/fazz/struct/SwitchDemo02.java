package com.fazz.struct;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/6 7:06
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "fazz";
        //jdk7以后，switch支持匹配String类型
        //字符的本质还是数字
        //反编译java --class（编译文件） ----idea（反编译）
        switch (name){
            case "fazz":
                System.out.println("right");
                break;//一定不能丢
        }
    }
}
