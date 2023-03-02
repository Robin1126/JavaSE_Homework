public class Instrument {
	public void makeSound() {
		System.out.println("乐器发出声音");
	}
}

class Erhu extends Instrument {
	public void makeSound() {
		System.out.println("二胡发出声音");
	}
}

class Piano extends Instrument {
	public void makeSound() {
		System.out.println("钢琴发出声音");
	}
}

class Violin extends Instrument {
	public void makeSound() {
		System.out.println("小提琴发出声音");
	}
}