/*4、编写Java程序模拟简单的计算器。
        定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
        编写构造方法赋予n1和n2初始值
        再为该类定义加addition()、减subtration()、乘multiplication()、除division()等公有实例方法
        分别对两个成员变量执行加、减、乘、除的运算。*/
public class Homework04 {
    public static void main(String[] args) {
        Number num = new Number(9,3);
        System.out.println("n1 = " + num.getN1());
        System.out.println("n2 = " + num.getN2());

        num.addition();
        num.substration();
        num.multiplication();
        num.division();


    }
}

class Number{
    private int n1;
    private int n2;

    public Number() {}

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int addition() {
        System.out.println(getN1() + "和" + getN2() + "的相加结果是" + (n1 + n2));
        return n1 + n2;
    }

    public int substration() {
        System.out.println(getN1() + "和" + getN2() + "的相减结果是" + (n1 - n2));
        return n1 - n2;
    }

    public int multiplication() {
        System.out.println(getN1() + "和" + getN2() + "的相乘结果是" + (n1 * n2));
        return n1 * n2;
    }

    public void division() {
        if(n2 == 0) {
            System.out.println("除数不能为0");
            return ;
        }
        System.out.println(getN1() + "和" + getN2() + "的相除结果是" + ((double)n1 / (double)n2));
    }
}
