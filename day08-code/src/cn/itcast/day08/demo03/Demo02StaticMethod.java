package cn.itcast.day08.demo03;

/*
一旦使用static修饰成员方法，这就变成了一个静态方法，静态方法不属于对象，而是属于类的

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
如果有了static关键字，那么不需要创建对象，直接就能铜鼓类名称来使用它

无论是成员变量还是成员方法，如果有了static，都推荐使用类名称进行调用
静态成员变量：类名称.静态变量
静态方法：类名称.静态方法()

注意事项：
1.静态只能直接访问静态，不能直接访问非静态
原因，因为在内存当中是先有的静态内容，后又的非静态内容
2.静态方法当中不能使用this

 */
public class Demo02StaticMethod {

    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先创建对象
        //然后才能使用没有static关键字的方法
        obj.method();

        //对于静态方法来说，可以通过对象名来进行调用，也可以直接通过类名称来调用
        obj.methodStatic();//正确，但是不推荐，这种写法在编译之后也会被javac翻译称为"类名称.静态方法名"
        MyClass.methodStatic();//正确，推荐

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
    }

    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}
