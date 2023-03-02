public class Homework03 {
	public static void main(String[] args) {
		boolean x,y,z;
		int a = 15;
		int b = 2;
		x = a>b; //true
		y = a<b; //false
		z = a!= b; //true a!=b的运算级高

		System.out.println("x="+x);//true
		System.out.println("y="+y);//false
		System.out.println("z="+z);//true

		//注意 这里的结果仍然显示的是boolean类型，不会显示数字
	}
}