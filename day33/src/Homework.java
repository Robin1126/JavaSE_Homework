/**
 * Author : Binbin Luo
 * Date : 16.03.2023
 */
/*
java多线程模拟实现12306售票

业务描述
	假设有200张票，用4个线程去订票，不能有两个或者以上的线程订到了
	同一个票（原因就不说了），当最后一张票卖掉的时候结束，再订就抛
	异常提示出票卖完了。

业务分析,要实现以上功能，

	1、需要创建一个车票类，初始化票，卖票的接口saleTicket()

	2、自定义异常的一个类。

	3、创建卖票线程类，在run方法中卖车票。

	4、初始化车票的线程,负责初始化车票,也就是初始化Ticket类中的数组。

	5、创建主方法进行测试。
 */
public class Homework {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread it = new Thread(new InitializeThread(ticket));
        it.setName("Initialize");

        it.start();

        Thread t1 = new Thread(new TicketThread(ticket));
        Thread t2 = new Thread(new TicketThread(ticket));
        Thread t3 = new Thread(new TicketThread(ticket));
        Thread t4 = new Thread(new TicketThread(ticket));

        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class SoldoutError extends Exception {
    public SoldoutError() {
    }

    public SoldoutError(String message) {
        super(message);
    }
}

