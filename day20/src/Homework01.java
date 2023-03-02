/*
第一题：
（1）定义一个抽象类Weapon,该抽象类有两个抽象方法attack()，move()
这两个方法分别表示武器的攻击方式和移动方式。

（2）定义3个类：Tank,Flighter,WarShip都继承自Weapon,
分别用不同的方式实现Weapon类中的抽象方法。

编写测试程序main方法，创建多个不同武器的实例。并分别调用attack()和move()方法。
能用多态尽量使用多态。
 */
public class Homework01 {
    public static void main(String[] args) {
        Weapon tank = new Tank();
        Weapon flighter = new Flighter();
        Weapon warship = new Warship();

        warship.attack();
        warship.move();

        tank.attack();
        tank.move();

        flighter.attack();
        flighter.move();
    }
}

abstract class Weapon{
    public abstract void attack();
    public abstract void move();
}
class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println("坦克发射炮弹！");
    }

    @Override
    public void move() {
        System.out.println("坦克行驶在路面上！");
    }
}

class Flighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("飞机投放炸弹！");
    }

    @Override
    public void move() {
        System.out.println("飞机在空中飞翔！");
    }
}
class Warship extends Weapon{
    @Override
    public void attack() {
        System.out.println("战舰发射导弹！");
    }

    @Override
    public void move() {
        System.out.println("战舰在海上行驶!");
    }
}