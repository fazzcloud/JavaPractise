package com.fazz.scanner;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/12 21:06
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ScannerTest {
    public static void main(String[] args) {
        //创建一个扫描器，用于接收键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收:");

        //判断用户有没有输入字符串
        if (scanner.hasNext() ){ //hasnext用于判断下一步是否有接收数据
            String str = scanner.next();
            System.out.println("接收到的数据为："+str);
        }

        scanner.close(); //凡是属于IO流的类，如果不关闭会一直占用资源，要养成好习惯用完就关掉
    }
}
