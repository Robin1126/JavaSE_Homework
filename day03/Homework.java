public class Homework {
	public static void main(String[] args) {
		int stuNr;
		String stuName;
		char stuSex;
		double stuHeight; // 为什么不能用float呢？精度会损失
		// String 是大写的

	//第一个学生
		stuNr = 110;
		stuName = "张三";
		stuSex = '男';
		stuHeight = 1.85;

		System.out.println("学号："+stuNr);
		System.out.println("姓名："+stuName);
		System.out.println("性别："+stuSex);
		System.out.println("身高："+stuHeight);

		System.out.println("--------------------------------");

	// 第二个学生
		stuNr = 120;
		stuName = "李四";
		stuSex = '女';
		stuHeight = 1.65;

		System.out.println("学号："+stuNr);
		System.out.println("姓名："+stuName);
		System.out.println("性别："+stuSex);
		System.out.println("身高："+stuHeight);

	}
}