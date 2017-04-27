package abs.factory.parttern;

public class TestMain {

	public static void main(String[] args) {
//		Sender sender = SmsSenderFactory.produce();
//		sender.send();
//		
//		sender = EmailSenderFactory.produce();
//		sender.send();
		
		Provider smsProvider = new SmsSenderFactory();
		Sender sender = smsProvider.produce();
		sender.send();
		
		Provider emailProvider = new EmailSenderFactory();
		sender = emailProvider.produce();
		sender.send();

	}

}
