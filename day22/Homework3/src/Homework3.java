/*
第三题：
按要求编写一个Java应用程序程序：
（1）定义一个接口CanFly，描述会飞的方法public void fly();
（2）分别定义类飞机和鸟，实现CanFly接口。
（3）定义一个测试类，测试飞机和鸟，在main方法中创建飞机对象和鸟对象，

再定义一个makeFly()方法，其中让会飞的事物飞。并在main方法中调用该方法，让飞机和鸟起飞
 */
public class Homework3 {

    //调用者 -- 接口 -- 实现者 调用者有接口，实现者继承接口，接口中只有方法和常量
    public static void main(String[] args) {
        CanFly canFly1 = new Flight();//实现者
        CanFly canFly2 = new Bird();
        User user = new User();//调用者

        user.makeFly(canFly1);//调用者调用接口，参数里的是接口，由实现者实现，这就是面向接口编程
        user.makeFly(canFly2);

    }
}
class User{
    private CanFly canFly;
    public void makeFly(CanFly canFly){
        canFly.fly();
    }
}

interface CanFly{
    void fly();
}
class Flight  implements CanFly{
    public void fly(){
        System.out.println("Flight is flying!");
    }
    public void makeFly() {
        fly();
    }
}
class Bird  implements CanFly{

    public void fly(){
        System.out.println("Bird is flying!");
    }
    public void makeFly(){
        fly();
    }
}
