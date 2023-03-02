/*
第一题：
（1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。
（2）定义接口B，里面包含抽象方法void setColor(String c)。
（3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。
（4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
圆柱体的高height、颜色color。
（5）创建主类来测试类Cylinder。
 */
public class Homework01 {
    private C c;
    public void use(C c,String color){
        c.volume();
        c.area();
        c.setColor(color);
    }
    public static void main(String[] args) {
        C cylinder = new Cylinder(4,5,"red");
        Homework01 user = new Homework01();
        user.use(cylinder,"yellow");

    }
}
interface A {
    double PI = 3.14;
    double area();
}
interface B {
    void setColor(String c);
}
interface C extends A,B{
    void volume();
}
class Cylinder implements C{
    private double radius;
    private double height;
    private String color;

    public Cylinder() {
    }

    public Cylinder(double radius, double height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        double area = PI * Math.pow(radius,2) * 2 + 2 * radius * PI *getHeight();
        System.out.println("area=" + area);
        return area;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
        System.out.println("color=" + getColor());
    }

    @Override
    public void volume() {
        double volume = PI * Math.pow(radius,2) * getHeight();
        System.out.println("volume=" + volume);
    }
}

