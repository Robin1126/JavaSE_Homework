public class Musician {
	public void play(Instrument i) { //可以直接传子类的对象，因为父类型的引用可以指向子类，向上转换
		System.out.print("乐手正在弹奏");
		i.makeSound();
	}
}