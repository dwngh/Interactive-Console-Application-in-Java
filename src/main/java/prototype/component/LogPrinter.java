package prototype.component;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class LogPrinter {
	
	// Printing log with time
	public static void print(String str) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		System.out.print("<" + dtf.format(now) + ">: ");
		System.out.println(str);
	}
}
