/*
编写程序模拟用户注册：
1、程序开始执行时，提示用户输入“用户名”和“密码”信息。
2、输入信息之后，后台java程序模拟用户注册。
3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。

注意：
	完成注册的方法放到一个单独的类中。
	异常类自定义即可。

	class UserService {
		public void register(String username,String password){
			//这个方法中完成注册！
		}
	}

	编写main方法，在main方法中接收用户输入的信息，在main方法
	中调用UserService的register方法完成注册。
 */
import java.util.Objects;
import java.util.Scanner;
public class Homework {
    static {
        System.out.println("欢迎使用本系统！");
        System.out.println("请输入用户名和密码");
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入用户名：");
        String user = scanner.next();

        System.out.print("请输入密码：");
        String password = scanner.next();

        try {
            userService.register(user, password);
        } catch (NameException e) {
            System.out.println(e.getMessage());
            System.out.println("系统退出！");
        }


    }
}

/**
 *
 */
class UserService {

    String user;
    String password;
    public UserService() {
    }

    public UserService(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "UserService{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public boolean equals(UserService userService) {
        return Objects.equals(this.getUser(), userService.getUser()) && Objects.equals(this.getPassword(), userService.getPassword());
    }

    /**
     * register方法，传入用户名和密码
     * @param user 用户名
     * @param password 密码
     * @throws NameException 当用户名为空，或者用户名的长度不在6-14位的时候，抛出异常
     * 注册成功提示对应的用户名信息
     */
    public void register(String user, String password) throws NameException {
        if (null == user || user.length() < 6 || user.length() > 14 ) { //空放到最前面,null放在user前面防止手滑
            throw new NameException("用户名必须为6-14位!");
        }
        this.user = user;
        this.password = password;
        System.out.println("恭喜用户" + getUser() + "注册成功！");
    }
}
class NameException extends Exception {
    public NameException() {
    }

    public NameException(String message) {
        super(message);
    }
}
