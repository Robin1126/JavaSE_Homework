/*
第二题：
在画图软件中，可以画出不同大小或颜色的圆形、矩形等几何图形。几何图形之间有许多共同的特征，如它们可以是用某种颜色画出来的，可以是填充的或者不填充的。此外还有些不同的特征，
比如，圆形都有半径，可以根据半径计算圆形的面积和周长，矩形都有宽和高，可以根据宽高来计算矩形的面积和周长。
1、编写Java程序。
(1)使用继承机制，分别设计实现抽象类 图形类，子类类圆形类、正方形类、长方形类，要求：
①抽象类图形类中有属性包括画笔颜色(String类型)、图形是否填充(boolean类型：true表示填充，false表示不填充)，
有方法获取图形面积、获取图形周长等；
②使用构造方法为其属性赋初值；
③在每个子类中都重写toString()方法，返回所有属性的信息；
④根据文字描述合理设计子类的其他属性和方法。
(2)设计实现画板类，要求：
①画一个红色、无填充、长和宽分别为10.0与5.0的长方形；
②画一个绿色、有填充、半径为3.0的圆形；
③画一个黄色、无填充、边长为4.0的正方形；
④分别求三个对象的面积和周长，并将每个对象的所有属性信息打印到控制台。
 */
public class Homework02 {
    public static void main(String[] args) {
        Graphics circle = new Circle("绿色",true,3);
        Graphics rectangle = new Rectangle("红色",false,10.0,5.0);
        Graphics square = new Square("黄色",false,4.0);
        Board board = new Board();

        board.paint(rectangle);
        board.paint(circle);
        board.paint(square);

    }


}
class Board{
    public Board() {
    }

    public void paint(Graphics graphics) {
        String string = graphics.toString();
        System.out.println(string);
        graphics.area();
        graphics.perimeter();
        System.out.println();

    }
}
