public class SavingsAccount {
	public double balance;
	public String name;
	public double interest;
	public SavingsAccount(double b, String s, double i){
		balance = b;
		name = s;
		interest = i;
	}
	public void deposit(double amount){
		balance += amount;
	}
	public void withdraw(double amount){
		balance -= amount;
	}
	public void addInterest(){
		balance += balance * (interest / 100);
	}
}
