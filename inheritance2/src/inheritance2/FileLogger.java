package inheritance2;

public class FileLogger  extends Logger {
	@Override
	public void log() // method overriding
	{
		System.out.println(" File is logged.");
	}
	
}
