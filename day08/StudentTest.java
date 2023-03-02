public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.stuID);
		System.out.println(s1.name);
		System.out.println(s1.address);
		System.out.println(s1.gender);
		System.out.println(s1.age);
		//语法 引用.实例变量名

		Student s2 = new Student();
		//s1是局部变量，它在栈当中
		//在new的过程中就分配了堆内存给对象student
		//当执行赋值语句时候，实际上是把堆内存中的地址赋值给了栈内存当中的s1
		//像这种s1变量保存的是内存地址的变量，叫做引用
		//s1，s2叫做引用
		//不能通过类名直接访问变量
		s2.name = "LBB";
		s2.gender = true;
		s2.age = 31;
		s2.address = "韶关市武江区";
		s2.stuID = 54684;
	}
}