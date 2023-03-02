/*
	小芳每天存2.5元，但是当这一天是存钱的第5天或者是5的倍数时，她就会花掉6元。问多少天可以存到100元？
*/

public class Homework06 {
	public static void main(String[] args) {
		double sum = 0;
		
		int day = 1;
		for (; ; day++ )
		{
			sum += 2.5;
			if (sum >= 100)
			{
				break;
			}
			if (day % 5 == 0)
			{
				sum -= 6;
			}
		}
		//另外一种写法，用while循环，只要没有达到100元都会一直持续下去
		day = 0;
		sum = 0;
		while (true)
		{
			day++;
			sum += 2.5;
			if (day % 5 == 0)
			{
				sum -= 6;
			}
			if (sum >= 100)
			{
				break;
			}

		}
		System.out.println("小丽在第" + day + "天时能存到" + sum + "元。");
	}

}