package cn.itcast.day08.demo04;

import java.util.Arrays;

/*
public static String toString(数组):将参数数组变成字符串（按照默认格式,[元素1，元素2，元素3，...]）
 */
public class Demo01Arrays {

    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intString = Arrays.toString(intArray);
        System.out.println(intString);

        int[] array1 = {2,1,3,10,6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
