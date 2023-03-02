//只不过采用了中文的标识符，标识符是可以用中文的

public class 学生测试 {
	public static void main(String[] args) {
		学生 张三 = new 学生();
		System.out.println(张三.学号); //0
		System.out.println(张三.姓名); //null

		张三.学号 = 1111;
		张三.姓名 = "张三";
		System.out.println(张三.姓名);
		System.out.println(张三.学号);
	}
}