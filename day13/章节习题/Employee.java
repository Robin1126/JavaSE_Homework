/*
第二题：计算不同类型的员工薪资
定义员工类Employee，员工包含姓名name、出生月份birthMonth两个属性，员工有获取指定月份工资的方法（getSalary(int month)），
如果该月员工生日，公司补助250元。
定义有固定工资的员工类SalariedEmployee，有月薪monthlySalary属性。
定义小时工类HourlyEmployee，包含工作小时数hours和每小时的工资hourlySalary属性，如果每月工作超过160小时，超过的部分按1.5倍工资发放。
定义销售人员类SalesEmployee，包含月销售额sales和提成比例comm属性。
*/
public class Employee {
	private String name;
	private int birthMonth;

	public Employee() {  }
	public Employee(String name, int birthMonth) {
		this.name = name;
		this.birthMonth = birthMonth;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public int getBirthMonth() {
		return birthMonth;
	}

	public void getSalary(int month) {} //发工资方法
}

//固定工资
class SalariedEmployee extends Employee{
	private double monthlySalary;
	
	public SalariedEmployee() {  }
	public SalariedEmployee(String name, int birthMonth, double monthlySalary) {
		super(name, birthMonth);
		this.monthlySalary = monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	
	public void getSalary(int month) {
		if ( month == super.getBirthMonth() )
		{
			setMonthlySalary(getMonthlySalary() + 250);
		}
		System.out.println(month + "月份" + super.getName() + "的工资是：" + getMonthlySalary() + "元。");
	}

}

//小时工
class HourlyEmployee extends Employee{
	private double hours;
	private double hourlySalary;

	public HourlyEmployee() {}
	public HourlyEmployee(String name, int birthMonth, double hours, double hourlySalary) {
		super(name, birthMonth);
		this.hours = hours;
		this.hourlySalary = hourlySalary;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getHours() {
		return hours;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
	public double getHourlySalary() {
		return hourlySalary;
	}

	public void getSalary(int month) {
		double salary = 0;
		if (getHours() >= 160)
		{
			salary = 160 * getHourlySalary() + (getHours() - 160) * (1.5 * getHourlySalary());
		}else {
			salary = getHours() * getHourlySalary();
		}
		if (month == super.getBirthMonth())
		{
			salary += 250;
		}
		System.out.println(month + "月份" + super.getName() + "的工资是：" + salary + "元。");
	}

}

class SalesEmployee extends Employee{
	private double sales;
	private double comm;

	public SalesEmployee() {}
	public SalesEmployee(String name, int birthMonth, double sales, double comm) {
		super(name, birthMonth);
		this.sales = sales;
		this.comm = comm;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}
	public double getSales() {
		return sales;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}
	public double getComm() {
		return comm;
	}

	public void getSalary(int month) {
		double salary = getSales() * getComm();
		if (month == super.getBirthMonth())
		{
			salary += 250;
		}
		System.out.println(month + "月份" + super.getName() + "的工资是：" + salary + "元。");
	}
}