public class Account
{
	private String id;

	private double balance;

	private double annualInterestRate;

	//构造方法

	public Account() {  }

	public Account(String _id, double _balance, double _annualInterestRate) {
		id = _id;
		balance = _balance;
		annualInterestRate = _annualInterestRate;
	}

	//id的赋值和取值
	public void setId(String _id) {
		id = _id;
	}

	public String getId() {
		return id;
	}

	//balance的赋值和取值
	public void setBalance(double _balance) {
		balance = _balance;
	}

	public double getBalance() {
		return balance;
	}

	//annualInterestRate的赋值和取值
	public void setAnnualInterestRate(double _annualInterestRate) {
		annualInterestRate = _annualInterestRate;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void withdraw(double number) {
		if (number > this.balance)
		{
			System.out.println("余额不足，取款失败。");
			return;
		}
		this.balance -= number;
		System.out.println("成功取出：" + number);
	}
	
	public void deposit(double number) {
		this.balance += number;
		System.out.println("成功存入：" + number);
	}

}
