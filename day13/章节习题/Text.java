public class Text {
	public static int k = 0;
	public static Text t1 = new Text("t1");
	public static Text t2 = new Text("t2");
	public static int i = print("i");
	public static int n = 99;
	
	static {
		print("静态块");
	}
	
	public Text(String str) { System.out.println((++k) + ":" + str + " i=" + i + " n=" + n); ++i; ++n; }
	public int j = print("j");
	public static int print(String str) { System.out.println((++k) + ":" + str + " i=" + i + " n=" + n); ++n; return ++i; }

	public static void main(String args[]) { new Text("init"); }
}
//创造对象时，先有属性，再有方法
//在对象中不看静态变量的赋值，只看 int j = print("j")和方法Text(String str)
/*
1:j i=0 n=0
2:t1 i=1 n=1
3:j i=2 n=2
4:t2 i=3 n=3
5:i i=4 n=4
6:静态块 i=5 n=99
7:j i=6 n=100
8:init i=7 n=101
*/

//加static的变量叫做静态变量，在类加载时初始化，不需要new对象，静态变量在类加载时就分配了空间，并且存储在方法区
//所以程序还没运行，编译通过的时候，就已经有i n k t1 t2了，运行的时候只是给他们赋值而已