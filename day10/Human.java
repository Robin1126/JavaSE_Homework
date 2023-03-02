public class Human
{
	//姓名
	private String name;
	//性别
	private boolean gender;
	//年龄
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String x) {
		name = x;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean sex) {
		gender = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int x) {
		if (x < 0 || x > 100)
		{
			System.out.println("输入的" + x +"在年龄中不合法！");
			return;
		}
		age = x;
	}
}