/*
第二题：（java软件工程师人生路上第一个小型项目。锻炼一下面向对象。）
	为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
	1、该系统的用户是：酒店前台。
	2、酒店使用一个二维数组来模拟。“Room[][] rooms;”
	3、酒店中的每一个房间应该是一个java对象：Room
	4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
	5、系统应该对外提供的功能：
		可以预定房间：用户输入房间编号，订房。
		可以退房：用户输入房间编号，退房。
		可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。
 */
import java.util.Scanner;
public class Homework02 {
    public static void main(String[] args) {
        Screen hotel = new Hotel(5,10);
        User user = new User(hotel);
        System.out.println("管理员，欢迎使用本酒店管理系统！");
        while(true) {
            System.out.println("请选择一项功能并输入对应的数字编号：1.定房 2.退房 3.查看所有房间的可用状态 输入其他任意数字退出");
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            if (num == 1) {
                System.out.println("请输入您要预定的房间编号：");
                user.bookRoom(new Scanner(System.in).nextInt());
            }else if (num == 2) {
                System.out.println("请输入您要退订的房间编号：");
                user.checkOut(new Scanner(System.in).nextInt());
            }else if (num == 3) {
                user.showDetails();
            }else {
                return;
            }
        }
    }
}

interface Screen{
    void bookRoom(int no);
    void checkOut(int no);
    void showDetails();
}
class User{
    private Screen screen;

    public User(Screen screen) {
        this.screen = screen;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    //订房操作
    public void bookRoom(int no){
        screen.bookRoom(no);
    }
    //退房操作
    public void checkOut(int no){
        screen.checkOut(no);
    }
    public void showDetails() {
        screen.showDetails();
    }

}
