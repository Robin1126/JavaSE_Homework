/*
第二题：
利用接口做参数，写个计算器，能完成加减乘除运算。
（1）定义一个接口Compute含有一个方法int computer(int n, int m)。
（2）设计四个类分别实现此接口，完成加、减、乘、除运算。
（3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)，此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
（4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。

调用者对象调用方法，接口在方法的参数列表当中，接口由别的类实现
 */
public class Homework2 {
    public static void main(String[] args) {
        Compute com1 = new Add();
        Compute com2 = new Sub();
        Compute com3 = new Multi();
        Compute com4 = new Div();

        UseCompute useCompute = new UseCompute();
        useCompute.useCom(com1,100,200);
        useCompute.useCom(com2,200,200);
        useCompute.useCom(com3,300,200);
        useCompute.useCom(com4,400,200);
        }
}

class UseCompute{
    public void useCom(Compute com, int one, int two){
        com.computer(one, two);
    }
}
interface Compute{
    int computer(int n, int m);
}
class Add implements Compute{
    public int computer(int n, int m){
        System.out.println(n + "+" + m + "="+ (n + m));
        return n + m;
    }
}
class Sub implements Compute{
    public int computer(int n, int m) {
        System.out.println(n + "-" + m + "="+ (n - m));
        return n - m;
    }
}
class Multi implements Compute{
    public int computer(int n, int m) {
        System.out.println(n + "*" + m + "="+ (n * m));
        return n * m;
    }
}
class Div implements Compute{
    public int computer(int n, int m) {
        System.out.println(n + "/" + m + "="+ (n / m));
        return n / m;
    }
}
