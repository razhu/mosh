
public class MailService {
	public void sendEmail() {
		// do stuff
		System.out.println("starting to send email");
		connect();
		authenticate();
		disconnect();
		System.out.println("end of sending email");
	}
	private void connect() {
		// do stuff
		System.out.println("connect");
	}
	private void disconnect() {
		// do stuff
		System.out.println("disconnect");
	}
	private void authenticate () {
		// do stuff
		System.out.println("authenticate");
	}
}
