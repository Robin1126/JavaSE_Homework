public class Homework01 {
	public static void main(String[] args) {
		int x = 10;
		int a = x+ x++;
		System.out.println("a="+a);//a=20
		System.out.println("x="+x);//x=11

		int b = x+ ++x;
		System.out.println("b="+b);//b=23
		System.out.println("x="+x);//x=12

		int c = x + x--;
		System.out.println("c="+c);//c=24
		System.out.println("x="+x);//x=11

		int d = x + --x;
		System.out.println("d="+d);//d=21
		System.out.println("x="+x);//x=10
	}
}