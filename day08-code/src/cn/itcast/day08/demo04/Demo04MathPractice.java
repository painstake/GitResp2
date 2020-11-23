package cn.itcast.day08.demo04;

public class Demo04MathPractice {

    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        //这样处理，变量i就是区间之内所有整数
        for(int i = (int) min;i < max;i++){
            int abs = Math.abs(i);//绝对值
            if(abs > 6 || abs < 2.1){
                System.out.println(i);
            }
        }







    }
}
