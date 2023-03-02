/*
第三题：某汽车租赁公司有多种汽车可以出租，计算汽车租金
	Vehicle是所有车的父类，属性：品牌、车牌号，有返回总租金的方法：public double getSumRent(int days){}
	小轿车类Car是Vehicle的子类，属性：车型（两厢、三厢、越野），两厢每天300，三厢每天350，越野每天500。
	多座汽车类Bus是Vehicle的子类，属性：座位数，座位数<=16的每天400，座位数>16的每天600。
编写测试类，根据用户选择不同的汽车，计算总租金。
*/

public class Test {
	public static void main(String[] args){
		Car v1 = new Car("大众", "IL520", "三厢");
		Bus v2 = new Bus("奔驰", "JR9527", 18);

		
		System.out.println("小轿车 车牌号为：" + v1.getPlate() + " 品牌：" + v1.getBrand() + " 车型： " + v1.getType() + " 15天的总租金是：" + v1.getSumRent(15));
		System.out.println("多座汽车 车牌号为：" + v2.getPlate() + " 品牌：" + v2.getBrand() + " 座位数： " + v2.getSeats() + " 15天的总租金是：" + v2.getSumRent(15));
	}
}

class Vehicle {
	private String brand;
	private String plate;

	public Vehicle() {  }
	public Vehicle(String brand, String plate) {
		this.brand = brand;
		this.plate = plate;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getPlate() {
		return plate;
	}
	
	public double getSumRent(int days) {
		return 0;
	}
}

class Car extends Vehicle {
	private String type;

	public Car() {}
	public Car(String brand, String plate, String type) {
		super(brand, plate);
		this.type = type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}

	//两厢、三厢、越野
	public double getSumRent(int days) {
		double sum = 0;
		if (getType().equals("两厢"))
		{
			sum = 300 * days;
		}else if (getType().equals("三厢"))
		{
			sum = 350 * days;
		}else if (getType().equals("越野"))
		{
			sum = 500 * days;
		}
		return sum;
	}
}

class Bus extends Vehicle {
	private int seats;

	public Bus() {}
	public Bus(String brand, String plate, int seats) {
		super(brand, plate);
		this.seats = seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getSeats() {
		return seats;
	}

	public double getSumRent(int days) {
		double sum = 0;
		if (getSeats() <= 16)
		{
			sum = 400 * days;
		}else {
			sum = 600 * days;
		}
		return sum;
	}

}