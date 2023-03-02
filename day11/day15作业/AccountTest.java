public class AccountTest
{
	public static void main(String[] args) {
		
		Cumstomer Jane_Smith = new Cumstomer("Smith", "Jane");
		Account a = new Account("1000", 2000, 1.23);
		Jane_Smith.openAccount(a); //建立联系
		
		Jane_Smith.deposit(100);
		Jane_Smith.withdraw(960);
		Jane_Smith.withdraw(2000);
		Jane_Smith.detail();

	}
}

class Cumstomer
{
	private String firstname;

	private String lastname;

	private Account account;

	public Cumstomer() {  }
	
	public Cumstomer(String _firstname, String _lastname) {
		firstname = _firstname;
		lastname = _lastname;
	}

	public void deposit(double num) {
		this.account.deposit(num);
	}

	public void withdraw(double num) {
		this.account.withdraw(num);
	}

	public void openAccount(Account _account) {
		this.account = _account;
	}
	
	public String getId() {
		return this.account.getId();
	}

	public double getBalance() {
		return this.account.getBalance();
	}

	public double getAnnualInterestRate() {
		return this.account.getAnnualInterestRate();
	}
	public void detail() {
		System.out.println("Cumsomer [" + this.firstname + "," + this.lastname + "] has a account : id is " + this.getId() + " annualInterestRate is " + this.getAnnualInterestRate() + " balance is " + this.getBalance() + "%");
	}
}