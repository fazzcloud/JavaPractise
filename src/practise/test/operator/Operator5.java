package practise.test.operator;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/10 7:44
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Operator5 {
    public static void main(String[] args) {
        //逻辑运算符，与（and） 或（or） 非（not取反）
        boolean a = false;
        boolean b = true;
        System.out.println("a&&b:"+(a&&b)); //两者比较，都为真，结果为真
        System.out.println("a||b:"+(a||b)); //两者比较，有一个为真，结果为真
        System.out.println("!(a||b):"+!(a||b));//假变真，真变假

        //短路运算
        //&&短路运算中，若前面的条件已经为false则不执行后面的判断
        int c = 5;
        boolean d = (c<4)&&(c++<10);  //c<4已经为false，所以c++<10不会执行
        System.out.println(d);//c<4，为false
        System.out.println(c);//因此，输出的c为自增前的c，还是5

    }
}
