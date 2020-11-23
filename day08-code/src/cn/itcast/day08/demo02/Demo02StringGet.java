package cn.itcast.day08.demo02;

/*
String当中与获取相关的常用方法有：

public int length():获取字符串当中含有的字符个数，拿到字符串长度
public String concat(String str):将当前字符串和参数字符串凭借成为返回值新的字符串
 */
public class Demo02StringGet {

    public static void main(String[] args) {
        //获取字符串的长度
        int length = "asdafadsfadfadfa".length();
        System.out.println("字符串的长度是："+length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello
        System.out.println(str2);//World
        System.out.println(str3);//HelloWorld
        System.out.println("======");

        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是："+ch);
        System.out.println("======");

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果根本没有，返回-1
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引是:"+index);

        System.out.println("HelloWorld".indexOf("abc"));//-1
    }
}
