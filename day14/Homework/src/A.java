/*
* 1、猜数字游戏
一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
另外再定义一个类B，对A类的实例变量v进行猜测。
	如果大了则提示大了
	小了则提示小了
	等于则提示猜测成功

* */
import java.util.Scanner;
public class A {
    private int v;

    public A() {
    }

    public A(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}

class B {
    int number;

    public B() {
    }

    public B(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void guess(A a) {
        if (a.getV() < number) {
            System.out.println("大了！");
        } else if (a.getV() > number) {
            System.out.println("小了！");
        } else {
            System.out.println("猜对了！");
        }

    }
}
