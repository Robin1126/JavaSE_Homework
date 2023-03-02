public class Pet {
	public void eat() {
		System.out.println("宠物正在吃");
	}
}

class Dog extends Pet {
	public void eat() {
		System.out.println("狗正在吃");
	}
}

class Cat extends Pet {
	public void eat() {
		System.out.println("猫正在吃");
	}
}

class Parrot extends Pet {
	public void eat() {
		System.out.println("鹦鹉正在吃");
	}
}

class Yier extends Pet {
	public void eat() {
		System.out.println("一二正在喝稀饭，喝得很香~");
	}

}
/*
	分析：起初，主人只喜欢养狗，后面又有了猫，最后还养了一只鹦鹉！
	这就象征着，客户有了新的需求，必须满足用户的需求~ 所以在上面就可以考虑将新的对象并入一个superclass
	但是对于主人来说，就不需要一种宠物对应一种feed方法~简化了代码~
*/