package abs.factory.parttern;

public class EmailSenderFactory implements Provider{
	@Override
	public Sender produce(){
		return new EmailSender();
	}
}
