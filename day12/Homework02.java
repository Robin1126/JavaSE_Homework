public class Homework02 {
	public static void main(String[] args) {
		Fish c = new Fish();
		c.setColor("棕");
		c.setName("布布");
		c.move();
		
		System.out.println("此时");

		Animal yier = new Animal();
		yier.setName("一二宝宝");
		yier.move();
	}
}

class Animal {
	private String name;


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void move() {
		System.out.println(getName() + "正在坐车回家！");
	}
}

class Fish extends Animal {
	private String color;



	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void move() {
		System.out.println(getColor() + "色的" + getName() + "正在偷吃一二的零食！");
	}

}