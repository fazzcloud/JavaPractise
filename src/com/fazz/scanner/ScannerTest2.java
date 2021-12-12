package com.fazz.scanner;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/12 21:18
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input:");

        if (scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println("value is :"+str);
        }
        scanner.close();
    }
}
