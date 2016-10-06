
public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee harry = new Employee("Hacker, Harry", 50000);
		harry.raiseSalary(10);
		System.out.println("Employee " + harry.getName() + " has a salary of " + harry.getSalary());
	}

}
