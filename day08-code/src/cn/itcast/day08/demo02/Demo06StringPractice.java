package cn.itcast.day08.demo02;

/*
1.首先准备一个int[]数组，内容是1，2，3
2.定义一个方法，用来将数组变成字符串
三要素
返回值类型：String
方法名称：fromArrayToString
参数列表：int[]
3.格式[wor1d#word2#word3]
用到for循环，字符串拼接，每个数组元素之前都有一个word字样，分隔使用的是#，区分一下是不是最后一个
4.调用方法，得到返回值，并打印字符串
 */
public class Demo06StringPractice {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        System.out.println(fromArrayToString(array));
    }

    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                str += "word" + array[i] +"]";
            }else{
                str += "word" + array[i] +"#";
            }
        }
        return str;
    }
}
