package inheritance2;

public class EmailLogger extends Logger{
	@Override
	public void log() // method overriding
	{
		System.out.println("Email was sent.");
	}
	

}
