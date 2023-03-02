/*
	第二题的改进
*/
import java.util.Scanner;
public class Homework02_1 {
	public static void main(String[] args) {
		initUi();
	}

public static void initUi() {
	Scanner s = new Scanner(System.in);
	System.out.println("欢迎使用本系统！");
	System.out.print("请输入用户名：");
	String username = s.nextLine();
	System.out.print("请输入密码：");
	String passwort = s.nextLine();

	//登录验证
	login(username,passwort);
}

public static void login(String x, String y) {
	if (x.equals("admin") && y.equals("123"))
	{
		System.out.println("登录成功！");
		System.out.println("欢迎回来，" + x + "!");
	}else {
		System.out.println("登录失败，用户名或密码不正确！");
	}
}

}