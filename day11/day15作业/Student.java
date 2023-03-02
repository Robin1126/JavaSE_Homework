/*
(封装)已知一个类 Student 代码如下：
class Student{
	String name;
	int age;
	String address;
	String zipCode;
	String mobile;
}
要求：
	1、把Student 的属性都作为私有，并提供get/set 方法以及适当的构造方法。
	2、为Student 类添加一个getPostAddress 方法，要求返回Student 对象的"地址"和"邮编"。
	注意：这里所说的地址是：address，不是内存地址。
*/

public class Student {
	private String name;

	private int age;

	private String address;

	private String zipCode;

	private String mobile;

	public Student() {
		address = "Ilmenau";
		zipCode = "98693";
	}

	//name get and set
	public String getName() {
		return this.name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	//age get and set
	public int getAge() {
		return age;
	}

	public void setAge(int _age) {
		age = _age;
	}

	//address set and get
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String _address) {
		this.address = _address;
	} 
	
	//zipCode set and get
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String _zipCode) {
		this.zipCode = _zipCode;
	}
	
	//mobile set and get
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String _mobile) {
		this.mobile = _mobile;
	} 

	//getPostAddress
	public void getPostAddress() {
		System.out.println(this.getName() +"的地址是：" + this.getAddress() + "。" + this.getAddress() + "的邮编是：" + this.getZipCode());
	}
	

}