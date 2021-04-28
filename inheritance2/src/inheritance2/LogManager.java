package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("Log into DB"); // This is sphagetti dont do like that.
			
		}else if(logType==2) {
			System.out.println("Log into File");
		}else {
			System.out.println("Email was sent");
		}
	}

}
//1 - DB
//2 - File
//3 - Email