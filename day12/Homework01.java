public class Homework01 {
	public static void main(String[] args) {
		Human h = new Human();
		h.setName("Binbin");
		h.speak();
	}
}

class Monkey {
	private String name;
	private boolean gender;

	public Monkey() {}
	public Monkey(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public boolean getGender() {
		return gender;
	}

	public void speak() {
		System.out.println(getName() + "is speaking!");
	}
}

class Human extends Monkey
{
	public Human() {}

	public void speak() {
		System.out.println(getName() + " is speaking english");
	}
}