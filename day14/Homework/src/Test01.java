import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int v = s.nextInt();
        A a = new A(v);
        B b = new B();
        b.setNumber(10);
        b.guess(a);
    }
}
