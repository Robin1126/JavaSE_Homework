/*
开放型题目：
	设计一个笔记本电脑类，属性随意，并且进行属性私有化，对外提供公开的set和get方法。

	设计一个可插拔的接口：InsertDrawable，该接口有什么方法自行定义。

	设计一个鼠标类，实现InsertDrawable接口，并实现方法。
	设计一个键盘类，实现InsertDrawable接口，并实现方法。
	设计一个显示器类，实现InsertDrawable接口，并实现方法。
	设计一个打印机类，实现InsertDrawable接口，并实现方法。

	在“笔记本电脑类”中有一个InsertDrawable接口属性，可以让笔记本
	电脑可插拔鼠标、键盘、显示器、打印机等。

	编写测试程序，创建多个对象，演示接口的作用。
 */
public class Homework {
    public static void main(String[] args) {
        InsertDrawable mouse = new Mouse("Dell","001");
        InsertDrawable keyboard = new Keyboard("lenovo","002");
        InsertDrawable monitor = new Monitor("acer","003");
        InsertDrawable printer = new Printer("cherry","004");
        InsertDrawable harddisk = new Harddisk("west","005");
        Laptop myLaptop = new Laptop("apple",13,"macbookpro");

        myLaptop.use(mouse);
        myLaptop.use(keyboard);
        myLaptop.use(monitor);
        myLaptop.use(printer);
        myLaptop.use(harddisk);
    }
}
class Laptop {
    private String brand;
    private double size;
    private String type;

    private InsertDrawable insertDrawable;

    public Laptop() {
    }

    public Laptop(String brand, double size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InsertDrawable getInsertDrawable() {
        return insertDrawable;
    }

    public void setInsertDrawable(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }

    public void use(InsertDrawable insertDrawable){
        insertDrawable.work();
    }
}

interface InsertDrawable{
    void work();
}

abstract class Part {
    private String brand;
    private String type;

    public Part(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }
}
class Mouse extends Part implements InsertDrawable{
    public Mouse(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void work() {
        System.out.println("鼠标工作");
    }
}
class Keyboard extends Part implements InsertDrawable{

    public Keyboard(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void work() {
        System.out.println("键盘工作");
    }
}
class Monitor extends Part implements InsertDrawable{
    public Monitor(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void work() {
        System.out.println("键盘工作");
    }
}
class Printer extends Part implements InsertDrawable{
    public Printer(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void work() {
        System.out.println("打印机工作");
    }
}
class Harddisk extends Part implements InsertDrawable{
    public Harddisk(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void work() {
        System.out.println("硬盘工作");
    }
}