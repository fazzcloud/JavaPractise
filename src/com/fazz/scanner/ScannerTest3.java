package com.fazz.scanner;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/19 21:05
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ScannerTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Scanner 中输入小数类型的数据
        int i = 0;
        float f = 0.1f;
        System.out.println("请输入整数：");

        if (scanner.hasNextInt()){  //判断是否有接收的整数型数据
            i = scanner.nextInt(); //如果有，则将接收的整型数据赋值给i
            System.out.println("整数数据：" + i);
        }
        else{
            System.out.println("不是整数数据");
        }

        System.out.println("------------------------");

        System.out.println("请输入小数：");
        if (scanner.hasNextFloat()){ //判断是否有接收的浮点型数据
            f = scanner.nextFloat(); //如果有，则将接收的浮点型数据赋值给i
            System.out.println("小数数据：" + f);
        }
        else{
            System.out.println("不是小数数据");
        }

        scanner.close(); //要先写出.close方法，在输入和关闭中间区域写代码
    }
}
