/*
	业务：编写一个方法，求整数n的阶乘
*/

import java.util.Scanner;
public class Homework01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n = s.nextInt();
		
		int result = factor(n);
		System.out.println(n+ "的阶乘结果是" + result);
	}
	
	
	public static int factor(int x) {
		int result = 1;
		while (x > 1)
		{
			result *= x;
			x--;
		}
		return result;
	}
}