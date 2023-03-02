//实例变量存储在堆内存对象的内部，局部变量存储在栈内存方法的活动空间当中

//

public class UserTest {
	public static void main(String[] args) {
		User u1 = new User();
		u1.id = 11111;
		u1.name = "张三";
		u1.password = "123";

		System.out.println(u1.id);
		System.out.println(u1.name);
		System.out.println(u1.password);
		

		User u2 = new User();
		u2.id = 22222;
		u2.name = "李四";
		u2.password = "456";

		System.out.println(u2.id);
		System.out.println(u2.name);
		System.out.println(u2.password);
	}
}