/*
	业务：从控制台接收一个整数，判断它是否为质数
*/


import java.util.Scanner;
public class Homework04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int i = s.nextInt();

		int j = (int)Math.sqrt(i); //Math.sqrt(a)返回的是一个double型
		boolean fact = true;
		for (int k = 2;k <= j ; k++ )
		{
			if (i % k == 0)
			{
				fact = false;
				break;
			}
		}
		System.out.println(fact ? i + "是质数！" : i + "不是质数！");
		//另一种思路
		//逐个测试
		boolean result = true;
		for (int k = 2; k < i ; k++ )
		{
			if (i % k == 0)
			{
				result = false;
				break;
			}
		}
		System.out.println(result ? i+"是质数！" : i + "不是质数！");


	}
}