package practise.test.base;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/9 20:08
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Base3 {
    public static void main(String[] args) {
        //操作比较大的数字时，注意内存溢出的问题
        //JDK7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        System.out.println(money);
        int years = 20;
        int total = years * money; //输出后结果为-1474836480，因为此时已经内存溢出，total超过了int类型的长度
        long total2 = years * money;//此时输出结果依旧会内存溢出，因为在定义years和money时为int，所以计算结果默认为int，计算结束已经内存溢出
        System.out.println(total);

        //正确做法如下：
        long total3 = (long)years * money; //在计算前，强制转换其中一个变量的类型
        System.out.println(total3);

        //为防止l与1混淆，定义类型为long时，一定要用大写的L

    }
}
