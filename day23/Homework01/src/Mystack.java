/*
    第一题：
	编写程序，使用一维数组，模拟栈数据结构。
	要求：
		1、这个栈可以存储java中的任何引用类型的数据。
		2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
		3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。）
		4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。

		public class MyStack{ // 栈类

			// 提供一个数组来存储栈中的元素
			Object[] elements;

			// 栈帧（永远指向栈顶部的元素）
			// 每加1个元素，栈帧+1
			// 每减1个元素，栈帧-1
			int index;

			// 构造方法
			// 构造方法是不是应该给一维数组一个初始化容量。

			// push方法（push方法压栈）
			// 压栈表示栈中多一个元素。
			// 但是栈如果已满，压栈失败。
			// 这个方法的参数以及返回值类型自己定义。

			// pop方法（pop方法弹栈）
			// 弹栈表示栈中少一个元素。
			// 但是栈如果已空，弹栈失败。
			// 这个方法的参数以及返回值类型自己定义。

		}

		main(){
			测试...
		}

 */
public class Mystack {
    private Object[] element;
    private int index;
    private Object top; //栈顶

    public Mystack() {
    }
    public Mystack(int volumn) {
        element = new Object[volumn];
        index = 0;
        top = null;
    }

    public Object[] getElement() {
        return element;
    }

    public void setElement(Object[] element) {
        this.element = element;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object getTop() {
        return top;
    }

    public void setTop(Object top) {
        this.top = top;
    }

    //push方法
    public void push(Object object){
        if (index == element.length) {
            System.out.println("当前栈已满，无法压栈！");
            return;
        }
        element[index] = object;
        top = object;
        index++;
    }

    public void pop(){
        if (index == 0){
            System.out.println("当前栈已经为空，无法弹栈！");
            return;
        }else if(index == 1){
            element[0] = null;
            top = null;
            index--;
        }else {
            element[index - 1] = null;
            top = element[index - 2];
            index--;
        }

    }
    public void show(){
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] + " ");
        }
    }

}
class Test{
    public static void main(String[] args) {
        Mystack mystack = new Mystack(5);
        int a1 = 5;
        int a2 = 3;
        double a3 = 3.14;
        String a4 = "hello";
        mystack.push(a1);
        mystack.push(a4);
        mystack.push(a3);
        System.out.println("栈顶元素是：" + mystack.getTop());
        mystack.show();

    }
}
