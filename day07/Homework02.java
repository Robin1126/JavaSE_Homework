/*
	业务：编写一个方法，输出大于某个正整数n的最小的质数
*/


import java.util.Scanner;
public class Homework02 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int n = s.nextInt();
		//获得n
		findPrimeNum(n);
		//int primeNum = findPrimeNum(n);
		//System.out.println("大于正整数"+ n + "的最小质数是" + primeNum);

	}

	//还可以达到更小功能的分割，比如可以写一个判断质数的方法
	//然后再利用一个打印质数的方法
	//还是方法的提取，不要只是想着把题目做完就完事了

	public static void findPrimeNum(int x) {
		int y = x;
		a:while (true)
		{
			y++;
			for (int k = 2; k < Math.sqrt(y) ; k++ ) //使用平方根会更快一点
			{
				if (y % k == 0)
				{
					continue a; //注意，这里要用continue跳出大循环while，以便找下一个质数
				}
			}
			break;
		}
		System.out.println("大于正整数"+ x + "的最小质数是" + y);
	}
}