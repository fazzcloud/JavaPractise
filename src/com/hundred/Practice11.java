package com.hundred;

/**
 * @Author: Fazzcloud
 * @Date: 2022/2/14 14:48
 * @Description: 手握日月摘星辰，世间无我这般人
 */

import java.util.Scanner;

/**
 * 练习11：提示用户输入三角形的边a、b、c，范围必须在 [1,100) 之间，判断三角形的类型：1.非三角形；2.等边三角形；3.直角三角形；4.等腰三角形；5.普通三角形
 */
public class Practice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个边");
        int a = scanner.nextInt();
        System.out.println("请输入第二个边");
        int b = scanner.nextInt();
        System.out.println("请输入第三个边");
        int c = scanner.nextInt();

        if (1 <= a && a < 100 && 1 <= b && b < 100 && 1 <= c && c < 100) {
            if (a + b > c && a + c > b && b + c > a) {
                if (a == b && a == c && b == c) {
                    System.out.println("是等边三角形");
                } else if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
                    System.out.println("是直角三角形");
                } else if (a == b || a == c || b == c) {
                    System.out.println("是等腰三角形");
                } else {
                    System.out.println("不是三角形");
                }
            }
        }
        else {
            System.out.println("请重新输入");
        }
        scanner.close();
    }
}
