/*2、定义一个学生类
        属性包括：学生编号、学生姓名、学生年龄
        属性私有化，对外提供公开的set和get方法
        提供无参构造和有参数构造方法
        提供一个display()方法，通过该方法打印学生信息。
        编写测试程序创建对象，调用display()方法。*/
public class Homework02 {
    public static void main(String[] args) {
        Student stu = new Student("007", "lbb", 30);
        stu.display();
    }
}

class Student {
    private String ID;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display() {
        System.out.println("学号：" + getID());
        System.out.println("姓名：" + getName());
        System.out.println("年龄：" + getAge());
    }
}