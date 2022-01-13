package com.oop.practice;

import java.util.Scanner;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/12 16:59
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//定义超市入口类
public class Test {
    public static void main(String[] args) {
        //初始化乌龟总数量
        int tortoisAsumNumber = 0; //猪鼻龟
        int tortoisBsumNumber = 0; //金钱龟
        int goldFishAsumNumber = 0; //红龙眼金鱼
        int goldFishBsumNumber = 0; //紫龙睛金鱼

        //初始化金鱼总价格
        int tortoiseASumprice = 0; //猪鼻龟
        int tortoiseBSumprice = 0; //金钱龟
        int goldFishAsumPrice = 0; //红龙眼金鱼
        int goldFishBsumPrice = 0; //紫龙睛金鱼

        //初始化整单总价格
        int finalPrice = 0;

        System.out.println("*****欢迎来到PET超市*****");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的姓名:");
        String userName = scanner.nextLine();
        System.out.print("请输入你的电话:");
        long uesrPhone = scanner.nextLong();//手机号码要用长整型

        while (true){
            System.out.print("请选择要购买的宠物（1.金鱼 2.乌龟 0.退出）：");
            //接收输入，判断选择的宠物种类
            int style = scanner.nextInt();
            System.out.println("-----------------"); //换行
            if (style == 2){
                System.out.print("请选择购买的种类（1.猪鼻龟 2.金钱龟）：");
                //接收输入，判断选择的乌龟种类
                int tortoiseStyle = scanner.nextInt();
                if (tortoiseStyle == 1){
                    //实例化乌龟对象
                    Tortoise tortoiseA = new Tortoise();
                    System.out.print("请输入购买数量：");
                    //定义单笔购买数量
                    int tortoiseAquantity = scanner.nextInt();
                    //定义单笔购买猪鼻龟总价
                    int tortoiseAprice = tortoiseA.FinalPriceA(tortoiseAquantity);
                    //将单笔价格累加到猪鼻龟总价上，数量同等操作
                    tortoiseASumprice = tortoiseASumprice + tortoiseAprice;
                    tortoisAsumNumber = tortoisAsumNumber + tortoiseAquantity;
                }
                else if (tortoiseStyle == 2){
                    //实例化乌龟对象
                    Tortoise tortoiseB = new Tortoise();
                    System.out.print("请输入购买数量：");
                    //定义单笔购买数量
                    int tortoiseBquantity = scanner.nextInt();
                    //定义单笔购买金钱龟总价
                    int tortoiseBprice = tortoiseB.FinalPriceA(tortoiseBquantity);
                    //将单笔价格累加到金钱龟总价上
                    tortoiseBSumprice = tortoiseASumprice + tortoiseBprice;
                    tortoisBsumNumber = tortoisBsumNumber + tortoiseBquantity;
                }else{
                    System.out.println("种类输入有误");
                }
            }
            else if (style == 1){
                System.out.println("请选择购买的种类（1.红龙眼金鱼 2.紫龙睛金鱼）：");
                int goldFishstyle = scanner.nextInt();
                if (goldFishstyle == 1){
                    //实例化金鱼对象
                    GoldFish goldFishA = new GoldFish();
                    System.out.print("请输入购买数量：");
                    int goldFishAquantity = scanner.nextInt();
                    //定义单笔购买红龙眼金鱼总价
                    int goldFishAprice = goldFishA.FinalPriceA(goldFishAquantity);
                    //将单笔价格累加到红龙眼金鱼总价上
                    goldFishAsumPrice = goldFishAsumPrice + goldFishAprice;
                    goldFishAsumNumber = goldFishAsumNumber + goldFishAquantity;
                }
                else if (goldFishstyle == 2){
                    //实例化金鱼对象
                    GoldFish goldFishB = new GoldFish();
                    System.out.print("请输入购买数量：");
                    int goldFishBquantity =scanner.nextInt();
                    //定义单笔购买紫龙睛金鱼总价
                    int goldFishBprice = goldFishB.FinalPriceA(goldFishBquantity);
                    //将单笔价格累加到紫龙睛金鱼总价上
                    goldFishBsumPrice = goldFishBsumPrice + goldFishBprice;
                    goldFishBsumNumber = goldFishBsumNumber + goldFishBquantity;
                }else{
                    System.out.println("种类输入有误");
                }
            }
            else if (style == 0){
                finalPrice = goldFishAsumPrice + goldFishBsumPrice + tortoiseASumprice + tortoiseBSumprice;
                System.out.println("客户【"+userName+"】"+",你选择的宠物如下：");
                System.out.println("宠物名 数量 宠物总价");
                System.out.println("-----------------");
                System.out.println("红龙眼金鱼："+"   "+goldFishAsumNumber+"   "+goldFishAsumPrice);
                System.out.println("紫龙睛金鱼："+"   "+goldFishBsumNumber+"   "+goldFishBsumPrice);
                System.out.println("猪鼻龟："+"   "+tortoisAsumNumber+"   "+ tortoiseASumprice);
                System.out.println("金钱龟："+"   "+tortoisBsumNumber+"   "+ tortoiseBSumprice);
                System.out.println("-----------------");
                System.out.println("总价为："+finalPrice+"元");
                System.out.println("*****谢谢惠顾*****");
                scanner.close();//关闭输入方法要写在break之前
                break;
            }
            else{
                System.out.println("种类输入有误");
            }

        }
    }
}
