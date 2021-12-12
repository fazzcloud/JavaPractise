package practise.test.operator;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/10 7:15
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Demo8 {
    public static void main(String[] args) {
        long a = 123456789;
        int b = 100;
        short c = 10;
        byte d = 8;
        double e = 20;
        float f = 30.0F;
        System.out.println(a+b+c+d); //long类型，有一个long则类型就为long
        System.out.println(b+c+d);//没有long，默认为int
        System.out.println(c+d);//没有long，默认为int
        System.out.println(c+d+e);//如果有double，类型则为double
        System.out.println(c+d+f);//如果有float，类型则为double

    }
}
