package de.tu_ilmenau.javase.homework02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/*
 2.已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。

linklist.iterator()命令可以返回一个迭代器，利用迭代器hasNext()判断是否有下一位，利用next()方法来读取下一位
 */
public class Homework02 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> ll = new LinkedList<>();
        for (String str: strs
             ) {
            ll.add(str);
        }
        // 删除重复的元素
        deleteSame(ll);
        // 1. 增强for循环打印
        printWithForeach(ll);
        System.out.println();
        System.out.println("------------------------------------");
        //2. 使用迭代器
        printWithIterator(ll);

    }
    public static void deleteSame(LinkedList linkedList) {
        int index = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            //取出当前元素
            Object o = linkedList.get(i);
            //查看该链表中o的第一个和最后一个下标
            //如果两个下标不相等，删掉最后一个下标上的元素
            while(linkedList.lastIndexOf(o) != linkedList.indexOf(o)) {
                linkedList.remove(linkedList.lastIndexOf(o));
            }

        }
    }

    public static void printWithForeach(LinkedList linkedList) {
        for (Object o : linkedList
             ) {
            System.out.print(o + " ");
        }
    }

    public static void printWithIterator(LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
