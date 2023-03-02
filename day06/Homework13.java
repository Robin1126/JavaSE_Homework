/*
	题目：一个四位数，恰好等于去掉它的首位数字之后所剩下的三位数的3倍，这个四位数是多少？
*/
public class Homework13 {
	public static void main(String[] args) {
		for (int i = 1000; i <= 9999 ; i++ )
		{
			int k = i % 1000;
			if (i == 3 * k)
			{
				System.out.println("这个四位数是：" + i);
				//break;
			}
		}
	}
}