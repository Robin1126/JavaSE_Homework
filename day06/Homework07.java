/*
	如果一个数恰好等于它的因子之和，则为完数 即 6 = 1 + 2 + 3，找出1000以内的所有完数
*/

public class Homework07 {
	public static void main(String[] args) {
		//找出一个数的因子
		//int sum = 0;
		for (int i = 1; i <= 1000 ; i++ )
		{
			int sum = 0;
			for (int j = 1; j <= i/2 ; j++ )
			{
				if (i % j == 0)
				{
					sum += j;
				}
			}
			if (i == sum)
			{
				System.out.println(i);
			}
			
			
		}
	}
}