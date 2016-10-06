
public class Letter {
	String sender;
	String recipient;
	String body = "";
	public Letter(String from, String to){
		sender = from;
		recipient = to;
	}
	public void addLine(String line){
		body += line + "\n";
	}
	public String getText(){
		return ("Dear " + recipient + ":\n\n" + body + "\nSincerely,\n\n" + sender);
	}
}
