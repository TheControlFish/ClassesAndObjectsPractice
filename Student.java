public class Student {
	String name;
	int score;
	int numTaken;
	public Student(String s){
		name = s;
		numTaken = 0;
		score = 0;
	}
	public String getName(){
		return name;
	}
	public void addQuiz(int s){
		numTaken++;
		score += s;
	}
	public int getTotalScore(){
		return score;
	}
	public double getAverageScore(){
		return ((double)score / numTaken);
	}
}
