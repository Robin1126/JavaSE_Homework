/*
	给一个不多于5位的数字
	1.求他是几位数
	2.逆序打印出各位数字
*/

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个不多于5位的数字：");
		int num = s.nextInt();
		int i = num;
		int p = 1;
		int j;
		while (true)
		{			
			j = num % 10;
			System.out.print(j);
			num /= 10;
			if (num == 0)
			{
				break;
			}
			p++;
		}
		System.out.println();
		System.out.println(i + "是一个" + p + "位数");
	}
}