/*2、请定义一个交通工具(Vehicle)的类
        其中有属性：
        速度(speed)
        体积(size)等等
        方法移动(move())
        设置速度(setSpeed(int speed))
        加速speedUp(),
        减速speedDown()等等.

        最后在测试类Vehicle中的main()中实例化一个交通工具对象
        并通过方法给它初始化speed,size的值并且打印出来。
        另外调用加速减速的方法对速度进行改变。*/

public class Test02 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(100, 2);
        System.out.println("speed:" + v.getSpeed());
        System.out.println("size:" + v.getSize());
        v.move();

        v.speedUp(15);
        v.move();

        v.speedDown(200);
        v.move();
    }
}

class Vehicle {
    private double speed;
    private double size;

    public Vehicle() {
    }

    public Vehicle(double speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void move() {
        System.out.println("体积为" + getSize() + "的车正在以" + getSpeed() + "千米/小时的速度向前行驶");
    };

    public void speedUp(double addSpeed) {
        System.out.println("加速了" + addSpeed + "千米/小时！");
        setSpeed(getSpeed() + addSpeed);
    }

    public void speedDown(double subSpeed) {
        if (subSpeed > getSpeed()) {
            setSpeed(0);
            System.out.println("车停止行驶");
        }else{
        System.out.println("减速了" + subSpeed + "千米/小时！");
        setSpeed(getSpeed() - subSpeed);}
    }
}
