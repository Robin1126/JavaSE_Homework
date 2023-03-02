package de.tu_ilmenau.javase.homework;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        try {
            list.searchIndex(456);
        } catch (LinkedListEmptyException e) {
            e.printStackTrace();
        }
    }
}
