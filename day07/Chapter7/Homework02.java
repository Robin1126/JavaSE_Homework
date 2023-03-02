/*
	业务：编写程序，模拟用户登录功能，首先在DOS命令窗口，提醒用户输入用户名和密码，当用户输入用户名为admin，密码为123的时候提示欢迎信息，当用户输入的用户名和密码不正确打印错误信息
	并且退出。尽量用定义相关方法来完成，不要都放到main当中。

*/
import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		System.out.print("请输入用户名：");
		//java.util.Scanner s = new java.util.Scanner(System.in);
		//String user = s.nextLine();
		//String passwort = enterPass();

		if (!checkName(enterName()))
		{
			System.out.println("输入的用户名有误！");
			return;
		}

		else if (!checkPass(enterPass()))
		{
			System.out.println("输入的密码有误！");
			return;
		}

		else {
			System.out.println("登录成功！欢迎回来!");
		}

	}
	
	public static String enterName() {
		System.out.print("请输入用户名：");
		java.util.Scanner s = new java.util.Scanner(System.in);
		return s.nextLine();
	}

	public static String enterPass() {
		System.out.print("请输入密码：");
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}

	public static boolean checkName(String x) {
		if (x.equals("admin"))
		{
			return true;
		}else {
			return false;
		}
	}

	public static boolean checkPass(String y) {
		if (y.equals("123"))
		{
			return true;
		}else {
			return false;
		}
	}
}