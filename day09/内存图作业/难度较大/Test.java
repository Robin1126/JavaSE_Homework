public class Test {
	public static void main(String[] args) {
		
		Address a = new Address();
		a.city = "北京";
		a.street = "大兴区";
		a.zipcode = "121221";

		User u = new User();
		System.out.println(u.id);//0
		System.out.println(u.username);//null
		System.out.println(u.addr);//null

		u.id = 11111;
		u.username = "张三";
		u.addr = a;

	}
}