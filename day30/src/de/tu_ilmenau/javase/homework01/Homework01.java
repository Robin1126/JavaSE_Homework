package de.tu_ilmenau.javase.homework01;

import java.util.ArrayList;
import java.util.List;

/*
    1.产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。

    思路：第一步利用Java.util.Random类中的nextInt(int num)方法创造出随机数,注意是左闭右开区间，不包括num

 */
public class Homework01 {
    public static void main(String[] args) {
        RandomCreator rc = new RandomCreator(100);
        int[] array = new int[10];
        List<Integer> list = new ArrayList();
        for (int a: array
             ) {
            a = rc.create();
//          System.out.println(a);
            if (a >= 10) {
                list.add(a);
                System.out.print(a + " ");
            }
        }


    }
}
