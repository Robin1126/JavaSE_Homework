public class SalaryTest {
	public static void main(String[] args) {
		Employee se = new SalariedEmployee("LBB", 11, 5000);
		se.getSalary(10);
		se.getSalary(11);

		Employee he = new HourlyEmployee("ZKY", 5, 180, 30.5);
		he.getSalary(5);
		he.getSalary(10);

		Employee he1 = new HourlyEmployee("BuBu", 8, 140, 27.5);
		he1.getSalary(8);
		he1.getSalary(5);

		Employee s = new SalesEmployee("Yier", 8, 100000, 0.03);
		s.getSalary(5);
		s.getSalary(8);
	}
}