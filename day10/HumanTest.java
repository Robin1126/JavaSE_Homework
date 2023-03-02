public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();

		h.setName("LBB");
		h.setAge(30);
		h.setGender(true);

		System.out.println("姓名 = " + h.getName());
		System.out.println("性别 = " + (h.getGender() ? "男" : "女"));
		System.out.println("年龄 = " + h.getAge());

		h.setAge(150);
	}
}