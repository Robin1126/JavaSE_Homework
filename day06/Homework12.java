/*
	题目：一球从100米高度自由下落，然后反弹一半的高度再落下，问他第10次落地时候，跑了多少米？
*/

public class Homework12 {
	public static void main(String[] args) {
		double height = 100;
		double sum = 100;
		for (int k = 1; k<= 9 ; k++)
		{
			
			height /= 2;
			sum += height * 2;
			
		}
		System.out.println("第10次落地时，跑了" + sum + "米。");
	}
}