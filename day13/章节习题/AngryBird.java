public class AngryBird{
	public static void main(String[] args) {
		Bird b1 = new RedBird();
		Bird b2 = new BlueBird();
		Bird b3 = new YellowBird();
		Bow bow = new Bow();

		bow.shot(b1);
		bow.shot(b2);
		bow.shot(b3);
	}
}

class Bow {
	public void shot(Bird bird) {
		System.out.println("弹弓弹射!");
		bird.fly();
	}
}

class Bird {
	private String color;
	private String name;
	private String flyType;
	
	public Bird() {}

	public Bird(String color, String name, String flyType) {
		this.color = color;
		this.name = name;
		this.flyType = flyType;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setFlyType(String flyType) {
		this.flyType = flyType;
	}

	public String getFlytype() {
		return this.flyType;
	}

	public void fly() {
		
	}
}

class RedBird extends Bird{
	public RedBird() {
		super("红色","红火","正常");		
	}

	public void fly() {
		System.out.println(super.getName() + ":" + super.getColor() + "小鸟" + super.getFlytype() + "飞向小猪！");
	}
}

class BlueBird extends Bird{
	public BlueBird() {
		super("蓝色","蓝冰","分成3个");		
	}

	public void fly() {
		System.out.println(super.getName() + ":" + super.getColor() + "小鸟" + super.getFlytype() + "飞向小猪！");
	}
}

class YellowBird extends Bird{
	public YellowBird() {
		super("黄色","黄风","加速");		
	}

	public void fly() {
		System.out.println(super.getName() + ":" + super.getColor() + "小鸟" + super.getFlytype() + "飞向小猪！");
	}
}
