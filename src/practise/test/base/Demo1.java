package practise.test.base;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/8 20:56
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Demo1 {
    public static void main(String[] args) {
        //整数拓展：进制 二进制0b 十进制 八进制0 十六进制0x
        int i = 10;
        int i2 = 010; //八进制
        int i3 = 0x10; //十六进制
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        //浮点数拓展：由于float可展示的长度有限，且存在舍入误差，最好不要使用浮点数进行比较
        //可使用BigDecimal 数学工具类

        //字符拓展：
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c1); //强制转换
        System.out.println(c2);
        System.out.println((int)c2); //强制转换
        //所有的字符本质还是数字
        //强制转换是根据编码Unicode，长度为0 - 65339来翻译的

        //转义字符
        // \t 制表符
        // \n 换行符

        //布尔值拓展：
        boolean flag = true;
        if (flag){
            System.out.println("flag");
        }

        if (flag == true){
            System.out.println("flag2");
        }
        //代码要精简，if (flag)和if (flag == true)效果是一样的

    }
}
