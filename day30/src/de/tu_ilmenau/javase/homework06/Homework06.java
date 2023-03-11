package de.tu_ilmenau.javase.homework06;

import java.util.ArrayList;
import java.util.List;

/*
 6.定义一个泛型为String类型的List集合，统计该集合中每个字符
（注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，
程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class Homework06 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        countAlphabet(list);
    }
    // 把每个元素转换成一个字符型数组，再统计数量
    private static void countAlphabet(List<String> list) {
        int[] count = new int[26];
        //这个数组26个格子，每个格子代表一个字母
        for (String s: list
             ) {
            char[] chars = s.toCharArray();
            for (char c: chars
                 ) {
                count[c % 97]++;
            }
        }
        // 对count数组中不为0的进行输出
        StringBuilder sb = new StringBuilder();
        //字符串的拼接都用StringBuilder/StringBuffer
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) sb.append(" " + ((char)(i+97)) + " = "+ count[i] + ",");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

}


