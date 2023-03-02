/*
	利用方法重载，定义一个方法可以找出2个int类型中较大的数并返回，再定义一个方法可以找出3个int类型中较大的数并返回
*/

import java.util.Scanner;
public class Homework03
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("输入第一个整数：");
		int a = s.nextInt();

		System.out.print("输入第二个整数：");
		int b = s.nextInt();

		System.out.print("输入第三个整数：");
		int c = s.nextInt();

		System.out.println(a + "和" + b + "中较大的数是" + findNum(a,b));
		System.out.println(a + "," + b + "," + c + "中最大的数是" + findNum(a, b, c));
	}

	public static int findNum(int x, int y) {
		return x <= y ? y : x;
	}

	public static int findNum(int x, int y, int z) {
		/*
		int temp;
		temp = (x <= y ? y : x);
		return temp <= z ? z : temp;
		*/
		return findNum(x , y) <= z ? z : findNum(x, y); //这样写可以节省变量
	}
}