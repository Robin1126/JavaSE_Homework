public class Homework06 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		System.out.println();
		System.out.println();
		i++;//i=1
		++j;//j=1
		System.out.println(i);//1
		System.out.println(j);//1
		System.out.println("--------------");
		System.out.println(i++);//1,i=2
		System.out.println(++j);//2,j=2
		System.out.println("--------------");
		System.out.println(i);//2
		System.out.println(j);//2

		System.out.println(10.0/3);//自动转为3.33333
		//如i=10,java中i=i++是10
		//c++中，i=i++是11
	}
}