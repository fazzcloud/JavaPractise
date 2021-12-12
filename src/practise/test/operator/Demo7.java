package practise.test.operator;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/10 7:11
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Demo7 {
    public static void main(String[] args) {
        //二元运算符
        //ctrl + d 复制当前行到下一行
        int a = 10;
        int b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / (double)b); //由于a/b的结果为0.5，若为int型则会被取整为0，所以要强制转换类型
    }
}
