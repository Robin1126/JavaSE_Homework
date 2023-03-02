/*
	一个5位数，判断是不是回文。个位和万位相同，十位和千位相同
*/

import java.util.Scanner;
public class Homework09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个5位数：");
		int num = s.nextInt();
		
		boolean result = false;
		int p1 = num % 10;
		int p2 = num / 10 % 10;
		int p3 = num / 1000 % 10;
		int p4 = num / 10000;

		if (p1 == p4 && p2 == p3)
		{
			result = true;
		}
		
		System.out.println(num + (result ? "是" : "不是") + "回文");
	}
}