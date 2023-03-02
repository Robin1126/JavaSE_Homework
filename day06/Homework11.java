/*
	计算 1！+2！+...+9！+10！
*/
public class Homework11 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 11 ; i++ )
		{
			int p = 1;
			for (int j = i; j > 1 ; j-- )
			{
				p *= j;
			}
			sum += p;
		}

		System.out.println("1到10的阶乘的和是：" + sum);
	}
}
