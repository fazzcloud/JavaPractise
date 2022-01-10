package com.fazz.array;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/10 13:48
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {11,22,33,44,55};

        //for .. each 加强循环
        //jdk1.5以后增加了加强循环，适用于打印数组，因为在加强循环中，无法获取数组下标
        for (int array : arrays) {
            System.out.print(" "+array); //将array输出
        }

        System.out.println("============");
         printArray(arrays);//调用打印方法打印数组

        System.out.println("============");
         int[] arraysNew = reverse(arrays); //创建方法返回的数组为新数组
        printArray(arraysNew);//调用打印方法打印数组


    }

    //将数组作为入参
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    //反转数组，将数组作为返回值返回,这里注意定义方法时，数据类型就要设定为数组
    public static int[] reverse(int[] arrays){
        //将反转后的数组作为新的数组返回
        int[] arraysNew = new int[arrays.length];

        //将原数组的首位，传给新数组末位，实现反转数组
        for (int i = 0,j = arrays.length - 1;i < arrays.length;i++,j--){
            arraysNew[j] = arrays[i];
        }
        return arraysNew;
    }
}
