package inheritance2;

public class DatabaseLogger  extends Logger {
	@Override
	public void log() // method overriding
	{
		System.out.println("Log into DB.");
	}
	

}
