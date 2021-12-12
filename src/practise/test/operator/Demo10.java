package practise.test.operator;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/10 7:29
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Demo10 {
    public static void main(String[] args) {
        //++ -- 自增，自减 一元运算符
        int a = 3;

        int b = a++;//执行完这行代码后，先给b赋值，再自增（先把a=3赋值给了b，然后a自增，a=3+1）
        //隐藏了一步，a = a + 1
        System.out.println(a); //4

        //隐藏了一步，a = a + 1
        int c = ++a;//执行完这行代码前，先自增，再赋值（前面的代码执行完，a此时已经为4，a先自增a=4+1，然后赋值给c ）

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //幂运算，用数学工具类来操作
        double e = Math.pow(2,3); //2的三次方，这里要用小数类型

    }
}
