package de.tu_ilmenau.javase.homework03;

import java.util.*;

/*
 3.分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，
那在成绩排序的基础上按照年龄由小到大排序。

姓名（String）年龄（int）分数（float）
liusan			20				90.0F
lisi				22				90.0F
wangwu			20				99.0F
sunliu			22				100.0F

编写一个Student类用来实现Comparable<Student>接口,并在其中重写CompareTo(Student o)方法　
在主函数中使用Comparable 与 Comparetor分别对ArrayList进行排序.

使用Comparetor需要使用一个匿名内部类，在使用Collections.sort(list,comparetor的时候重写compare方法)
使用comparable需要在写student类的时候实现接口
 */
public class Homework03 {
    public static void main(String[] args) {
        //新建一个List存储数据
        List<Student> list = new ArrayList<>();
        list.add(new Student("liusan",20,90.0F));
        list.add(new Student("lisi",22,90.0F));
        list.add(new Student("wangwu",20,99.0F));
        list.add(new Student("sunliu",22,100.0F));

        // 1. 利用Comparetor对ArrayList进行排序
        compWithComparetor(list);

        System.out.println("*******************************");
        // 2. 利用Student的实现comparable接口来进行排序
        Collections.sort(list);
        for (Student s:list
             ) {
            System.out.println("利用comparable接口进行排序 --> " + s);
        }



    }

    private static void compWithComparetor(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() == o2.getScore()) {
                    return o1.getAge() - o2.getAge();
                }
                return (int) (o2.getScore() - o1.getScore());
            }
        });
        for (Student s: list
             ) {
            System.out.println("利用Comparator进行排序 --> " + s);
        }
    }
}


