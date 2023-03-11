package de.tu_ilmenau.javase.homework04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
4. 现在有一个map集合如下：
Map<Integer,String> map = new HashMap<Integer, String>();
map.put(1, "张三丰");
map.put(2, "周芷若");
map.put(3, "汪峰");
map.put(4, "灭绝师太");
要求：
	1.遍历集合，并将序号与对应人名打印。
	2.向该map集合中插入一个编码为5姓名为郭靖的信息
	3.移除该map中的编号为1的信息
	4.将map集合中编号为2的姓名信息修改为"周林"

	考虑使用迭代器！
    1. 使用map.entry()方法将map转换成一个set，这个set<Map.Entry<K,V>> 中的Map.Entry就是一个class
    2. Map.Entry中提供了方法让我们来获得key和value的值
 */
public class Homework04 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

       // 使用foreach来遍历，但是也是需要map.entrySet()来先转换的
        printMap(map);
        //插入信息
        map.put(5, "郭靖");
        
        //移除编号为1的信息
        map.remove(1);

        //修改编号为2的信息为周琳
        map.replace(2,"周琳");

        System.out.println("************************");
        printMap(map);


        
    }
    // 不能在方法中再次定义方法啊！！！！！！！！
    public static void printMap(Map<Integer, String> map) {
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry: entrySet
        ) {
            System.out.println("key --> " + entry.getKey() +
                    "\tvalue --> " + entry.getValue());
        }
    }


}
