package de.tu_ilmenau.javase.homework;

import java.io.*;
import java.util.Scanner;

/*
序列化用的其实是ObjectOutputStream,将java对象保存到文件当中
反序列化用的是ObjectInputStream，将java对象从文件当中读取到内存

需要java的类中实现接口Serializable

1、请使用序列化和反序列化机制，完成学生信息管理系统。

系统打开时显示以下信息：
欢迎使用学生信息管理系统，请认真阅读以下使用说明：
请输入不同的功能编号来选择不同的功能：
[1]查看学生列表
[2]保存学生
[3]删除学生
[4]查看某个学生详细信息

--------------------------------------------------------------------
学生信息列表展示
学号			姓名			性别
------------------------------------
1				zhangsan		男
2				lisi			女
.....

--------------------------------------------------------------------
查看某个学生详细信息
学号：1
姓名：张三
性别：男
邮箱：zhangsan@123.com

---------------------------------------------------------------------
删除学生时，需要让用户继续输入删除的学生编号，根据编号删除学生。


注意：请使用序列化和反序列化，以保证关闭之后，学生数据不丢失。
学生数据要存储到文件中。
 */
public class Homework {
    static {
        System.out.println("欢迎使用学生信息管理系统，请认真阅读以下使用说明：\n" +
                "请输入不同的功能编号来选择不同的功能：\n" +
                "[1]查看学生列表\n" +
                "[2]保存学生\n" +
                "[3]删除学生\n" +
                "[4]查看某个学生详细信息");

    }
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        Management management = new Management();
        Student s1 = new Student(1,"张三",true,"zhangsan@gmail.com");
        Student s2 = new Student(2,"李四",false,"lisi@gmail.com");
        Student s3 = new Student(3,"王五",true,"wangwu@gmail.com");
        management.add(s1);
        management.add(s2);
        management.add(s3);

        System.out.print("请输入功能编号：");
        int option = s.nextInt();

        switch (option) {
            case 1:
                management.checkStudentlist();
                break;
            case 2:
                management.saveStudent();
                break;
            case 3:
                management.deleteStudent();
                break;
            case 4:
                System.out.print("请输入学生的学号： ");
                int id = s.nextInt();
                try {
                    showDetails(id);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
        }
    }

    private static void showDetails(int id) throws IOException, ClassNotFoundException {
        String path = Thread.currentThread().getContextClassLoader().getResource("de/tu_ilmenau/javase/homework/student").getPath();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Student[] students = (Student[]) ois.readObject();
        if (ois != null) {
            ois.close();
        } //读完要记得关闭

        Student student = students[id - 1];
        System.out.println("学号：" + student.getNo() + "\n" +
                "姓名：" + student.getName() + "\n" +
                "性别：" + (student.isGender()? "男":"女")+ "\n" +
                "邮箱：" + student.getMail());

    }
}

class Student implements Serializable {
    private int no;
    private String name;
    private boolean gender;
    private String mail;


    public Student() {
    }

    public Student(int no, String name, boolean gender, String mail) {
        this.no = no;
        this.name = name;
        this.gender = gender;
        this.mail = mail;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", mail='" + mail + '\'' +
                '}';
    }
}

class Management {
    private Student[] students;
    private int index;

    public Management() {
        this.index = 0;
        students = new Student[255];
    }

    public Management(Student[] students, int index) {
        this.students = students;
        this.index = index;
    }

    public void add(Student s) {
        students[index++] = s;
    }

    public void checkStudentlist() {
        System.out.println("学号\t\t姓名\t\t性别");
        System.out.println("====================");
        for (Student student:students
             ) {
            if (student != null) {
                System.out.println(student.getNo() + "\t\t" + student.getName() + "\t\t" + (student.isGender() ? "男" : "女"));
            }
        }
    }

    public void saveStudent() throws IOException {
        String path = Thread.currentThread().getContextClassLoader().getResource("de/tu_ilmenau/javase/homework/student").getPath();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(this.students);
        oos.flush();
        oos.close();
        System.out.println("保存所有学生信息成功！");
    }

    public void deleteStudent() {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入要删除的学生编号：");
        int index = s.nextInt();
        if (index > students.length) {
            System.out.println("输入的学生编号有误！");
            return;
        }
        for (int i = index; i < students.length ; i++) {
            students[i - 1] = students[i];
        }
        System.out.println("删除第" + index + "号学生信息成功！");

    }

}
