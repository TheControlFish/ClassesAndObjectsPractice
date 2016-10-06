
public class SavingsAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount myAccount = new SavingsAccount(1000, "Jace Fulton", 10);
		myAccount.addInterest();
		System.out.println("Expected: " + 1100);
		System.out.println(myAccount.balance);
		
	}

}
