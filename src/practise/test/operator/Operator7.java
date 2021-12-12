package practise.test.operator;

/**
 * @Author: Fazzcloud
 * @Date: 2021/12/12 20:18
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class Operator7 {
    public static void main(String[] args) {
        //x ？ y：z
        //如果x == true 那么结果为y，否则结果为z
        int score = 98;
        String type = score < 60 ? "不及格":"及格";
        //效果与if相同
        System.out.println(type);
    }
}
