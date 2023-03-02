/*
	不断写代码，积累经验
	业务：计算1+2-3+4-5+6-7+...+100的结果
	运用到Math.pow(a,b) 即a的b次方
*/

public class Homework02 {
	public static void main(String[] args) {
		int sum = 1;
		for (int i = 2; i <= 100 ; i++ )
		{
			sum += i * Math.pow(-1,i);
		}
		System.out.println("sum = " + sum);
	
	//另一种思路：偶数就是加，奇数就是减，同样也是从sum=1开始
		sum = 1;
		for (int i = 2; i <= 100 ; i++ )
		{
			if (i % 2 == 0)
			{
				sum += i;
			}else {
				sum -= i;
			}
		}
		System.out.println("sum = " + sum);
	}
}