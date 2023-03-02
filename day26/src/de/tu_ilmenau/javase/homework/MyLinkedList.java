package de.tu_ilmenau.javase.homework;
/*
    实现的时候还是拿一个当指针比较好
 */
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

public class MyLinkedList<T>  {
    private Node header;
    private int length;


    public MyLinkedList() {
        header = new Node();
        length = 0;
    }

    private int getLength() {
        length = 0;
        Node temp = header;
        while (temp.getNext() != null) {
            length += 1;
            temp = temp.getNext();
        }
        return length;
    }



    // 添加数据的方法
    public void add(T object) {
        Node newNode = new Node(object,null);
        Node temp = header;

        while (temp.getNext() != null){ //不断往下直到找到最后一个节点
            temp = temp.getNext();
        }

        temp.setNext(newNode);
    }

    private void checkPos(int index) throws LinkedListRemoveException{
        if (index < 1 || index > this.getLength()) {
            LinkedListRemoveException e = new LinkedListRemoveException("删除元素的位置不合法！");
            throw e;
        }
    }
    // 删除数据的方法
    public void remove(int index) throws LinkedListRemoveException {
            checkPos(index);
            Node temp = header;
            int curpos = 0;
            while (curpos != index - 1) {
                temp = temp.getNext();
                curpos++;
            }
            temp.setNext(temp.getNext().getNext());
    }

    // 修改数据的方法
    public void change(T data, int index) {
        checkPos(index);
        Node temp = header;
        int curpos = 0;
        while (curpos != index - 1) {
            temp = temp.getNext();
            curpos++;
        }
        temp.getNext().setData(data);
    }

    // 查找数据的方法
    public void searchIndex(T data) throws LinkedListEmptyException {
        int result = search(data);
        System.out.println(result < 0 ? "链表中不存在元素" + data : "元素 " + data + " 位于链表的第 " + result + " 位！");
    }
    private void checkEmpty() throws LinkedListEmptyException {
        if (header.getNext() == null) {
            LinkedListEmptyException e = new LinkedListEmptyException("链表为空!");
            throw e;
        }
    }
    private int search(T data) throws LinkedListEmptyException{
        int index = 0;
        checkEmpty();
        Node temp = header.getNext();
        index = 1;
        while(!data.equals(temp.getData()) && temp.getNext() != null) {
            temp = temp.getNext();
            index++;
        }
        if (temp.getData().equals(data)) {
            return index;
        } else {
                return -1;
        }

    }

    // 打印集合中每个元素的方法
    public void print() throws LinkedListEmptyException {
        if (header.getNext() == null) {
            LinkedListEmptyException e = new LinkedListEmptyException("链表为空！");
            throw e;
        } else {
            Node temp = header.getNext();
            while (temp.getNext() != null){
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
            System.out.println(temp.getData());

        }
    }


}






class LinkedListRemoveException extends RuntimeException {
    public LinkedListRemoveException() {
    }

    public LinkedListRemoveException(String message) {
        super(message);
    }
}

class LinkedListEmptyException extends RuntimeException {
    public LinkedListEmptyException() {
    }

    public LinkedListEmptyException(String message) {
        super(message);
    }
}