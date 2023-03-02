/*
	多态练习题 测试程序

	面向更加抽象进行编程，面向父类编程，因为面向具体对象编程，会导致软件的扩展性变差
*/

public class Test02 {
	public static void main(String[] args) {
		Master lbb = new Master();
		Pet p1 = new Dog();
		Pet p2 = new Cat();
		Pet p3 = new Parrot();
		//Pet yier = new Yier();

		lbb.feed(p1);
		lbb.feed(p2);
		lbb.feed(p3);
		lbb.feed(new Yier());
	}
}

