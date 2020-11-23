package cn.itcast.day08.demo04;

import java.util.Arrays;

/*
题目：
请使用Arrays相关的API，将一个随机字符串钟得所有字符升序排列，并倒序打印
 */
public class Demo02ArraysPractice {

    public static void main(String[] args) {
        String str = "adfad7234sadfadf99pq";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
