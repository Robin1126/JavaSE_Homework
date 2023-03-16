/**
 * Author : Binbin Luo
 * Date : 16.03.2023
 */

/*
    场景：买电影票，总共300张票，有5个售票机
    要求没有票的时候抛出异常
    票要实现sale()接口
    要有初始化线程，用来初始化票
    要有售票机类，用来卖票
    test类中创建线程并且测试

    接口一直都有调用者和实现者，调用者需求服务，实现者提供服务
    要实现多线程共享资源，类的属性中一定要含有要共享的类

    还要注意上锁，这里是给实现接口的方法上了锁
 */
public class Test {
    public static void main(String[] args) {
        TicketBox tb = new TicketBox(new Ticket[300]);
        Thread it = new Thread(new Initialize(tb));
        it.setName("Initialize");
        it.start();

        Thread m1 = new Thread(new Machine(tb));
        Thread m2 = new Thread(new Machine(tb));
        Thread m3 = new Thread(new Machine(tb));
        Thread m4 = new Thread(new Machine(tb));
        Thread m5 = new Thread(new Machine(tb));

        m1.setName("m1");
        m2.setName("m2");
        m3.setName("m3");
        m4.setName("m4");
        m5.setName("m5");

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
    }
}
