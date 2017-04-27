package abs.factory.parttern;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("send sms");

	}

}
