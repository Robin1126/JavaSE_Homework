/* 
	从键盘接收一个正整数，以该正整数为行数，输出
	    *
		***
	  *****
	 *******
   *********

	上面的案例 输入的正整数是5
	

*/
import java.util.Scanner;
public class Homework05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int i = s.nextInt();
	//键盘输入接收

	//每一行的*数目是2n-1
	//空格的转义字符是\b
		
		for (int raw = 1; raw <= i ; raw++ )
		{
			for (int k = 1; k <= i - raw ; k++ )
			{
				System.out.print(' ');
			}
			for (int j = 1; j <= 2*raw-1 ; j++ )
			{
				System.out.print("*");
			}
			System.out.println();//换行
		}

	}
}