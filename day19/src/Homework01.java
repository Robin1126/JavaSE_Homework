/*
1.定义一个用户类
要处理的信息有用户ID、用户密码、email地址。
属性私有化，对外提供公开的set和get方法
提供无参数构造方法
提供有参数构造方法
提供一个showInfo()方法，通过这个方法展示用户信息。
编写测试程序创建对象，调用showInfo()方法。
 */
public class Homework01 {
    public static void main(String[] args) {
        User lbb = new User("007", "Woaiky", "luobinb7@gmail.com");
        lbb.showInfo();
    }
}

class User {
    private String ID;
    private String password;
    private String mailAddress;

    public User() {
    }

    public User(String ID, String password, String mailAddress) {
        this.ID = ID;
        this.password = password;
        this.mailAddress = mailAddress;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public void showInfo() {
        System.out.println("ID : " + getID());
        System.out.println("password : " + getPassword());
        System.out.println("email : " + getMailAddress());
    }
}
