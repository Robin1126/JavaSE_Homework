/*
	猴子吃桃，每天都吃一半的桃子加一个，到第10天的时候只剩下1个。问第一天摘了多少个？
*/

public class Homework10 {
	public static void main(String[] args) {
		int day = 1;
		int sum = 1;
		while (day <= 9)
		{
			sum = (sum + 1) * 2;
			day++;
		}
		System.out.println("猴子第一天摘了" + sum + "个桃子");
	}
}