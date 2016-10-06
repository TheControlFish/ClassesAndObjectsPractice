
public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student henry = new Student("Henry");
		henry.addQuiz(92);
		henry.addQuiz(95);
		henry.addQuiz(86);
		henry.addQuiz(64);
		henry.addQuiz(100);
		System.out.println("Student " + henry.getName() + " has a total score of " + henry.getTotalScore() + " and an average score of " + henry.getAverageScore());
		
	}

}
