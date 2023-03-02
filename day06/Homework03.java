/*
	业务：从键盘输入一个正整数，计算阶乘。
*/

import java.util.Scanner;
public class Homework03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int i = s.nextInt();

		//上面是键盘输入
		
		int result = 1;
		for (int k = i; k > 1 ; k-- ) //一开始有1了，不用考虑1，可以少执行一次，效率更高
		{
			result *= k;
		}
		System.out.println(i+"的阶乘是："+result);
	}
}