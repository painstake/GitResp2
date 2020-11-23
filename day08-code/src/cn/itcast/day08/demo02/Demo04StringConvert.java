package cn.itcast.day08.demo02;

import java.util.function.DoubleToIntFunction;

/*
String当中与转换相关的常用方法有：

public char[] toCharArray();将当前字符串拆分成为字符数组作为返回值
public byte[] getBytes();获得当前字符串子层的字节数组
public String replace(CharSequence oldString,CharSequence newString);
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串
 */
public class Demo04StringConvert {

    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);//s
        System.out.println("======");

        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("======");

        //进行字符串的内容替换
        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);//How do you do?
        System.out.println(str2);//H*w d* y*u d*?
        System.out.println("======");

        String lang1 = "会不会玩儿啊！你大爷的！";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println(lang2);
    }
}