/*
在画图软件中，可以画出不同大小或颜色的圆形、矩形等几何图形。几何图形之间有许多共同的特征，如它们可以是用某种颜色画出来的，可以是填充的或者不填充的。此外还有些不同的特征，比如，圆形都有半径，可以根据半径计算圆形的面积和周长，矩形都有宽和高，可以根据宽高来计算矩形的面积和周长。
1、编写Java程序。
(1)使用继承机制，分别设计实现抽象类 图形类，子类类圆形类、正方形类、长方形类，要求：
①抽象类图形类中有属性包括画笔颜色(String类型)、图形是否填充(boolean类型：true表示填充，false表示不填充)，
有方法获取图形面积、获取图形周长等；
②使用构造方法为其属性赋初值；
③在每个子类中都重写toString()方法，返回所有属性的信息；
④根据文字描述合理设计子类的其他属性和方法。

平方 Math.pow(a,2)
 */
public abstract class Graphics {
    private String color;
    private boolean fill;
    public abstract void area();
    public abstract void perimeter();

    public Graphics() {
    }

    public Graphics(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public String toString() {
        return null;
    }
}

class Circle extends Graphics{
    private double diameter;
    public static final double PI = 3.14;
    public Circle() {
    }

    public Circle(String color, boolean fill, double diameter) {
        super(color, fill);
        this.diameter = diameter;
    }

    @Override
    public void area() {
        System.out.println("圆的面积是：" + PI * Math.pow(getDiameter()/2,2));
    }

    @Override
    public void perimeter() {
        System.out.println("圆的周长是：" + PI * getDiameter());
    }

    @Override
    public String toString() {
        return "圆的直径：" + getDiameter() + " 画笔颜色：" + getColor() + " 是否填充：" + (isFill() ? "填充":"不填充");
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
class Square extends Graphics{
    private double length;

    public Square() {
    }

    public Square(String color, boolean fill, double length) {
        super(color, fill);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void area() {
        System.out.println("正方形的面积是：" + Math.pow(getLength(),2));
    }

    @Override
    public void perimeter() {
        System.out.println("正方形的边长是：" + 4 * getLength());
    }
    public String toString() {
        return "正方形的边长是:" + getLength() + " 画笔颜色：" + getColor() + " 是否填充：" + (isFill() ? "填充":"不填充");
    }
}
class Rectangle extends Graphics{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(String color, boolean fill, double length, double width) {
        super(color, fill);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("长方形的面积是：" + getLength() * getWidth());
    }

    @Override
    public void perimeter() {
        System.out.println("长方形的周长是：" + (getLength() + getWidth()) * 2);
    }

    public String toString() {
        return "长方形的长：" + getLength() + " 宽：" + getWidth() + " 画笔颜色：" + getColor() + " 是否填充：" + (isFill() ? "填充":"不填充");
    }

}
