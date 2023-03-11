package de.tu_ilmenau.javase.homework05;

import java.util.*;

/*
5.有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
如{黑龙江省=哈尔滨, 浙江省=杭州, …}
 */
public class Homework05 {
    public static void main(String[] args) {
        ArrayList<String> provinces = new ArrayList<>();
        provinces.add("黑龙江省");
        provinces.add("浙江省");
        provinces.add("江西省");
        provinces.add("广东省");
        provinces.add("福建省");
        ArrayList<String> capitals = new ArrayList<>();
        capitals.add("哈尔滨");
        capitals.add("杭州");
        capitals.add("南昌");
        capitals.add("广州");
        capitals.add("福州");

        //将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < provinces.size(); i++) {
            map.put(provinces.get(i),capitals.get(i));
        }
        Set<Map.Entry<String,String>> set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
