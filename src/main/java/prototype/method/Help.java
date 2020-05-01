package prototype.method;
import java.util.List;
import main.Temp;

public class Help implements Method {
	public Temp Execute(Temp temp, List<String> cmd) {
		Method[] list = Library.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getHelp());
		}
		System.out.println("___________________");
		System.out.println("You can expand it by using Method interface and register it in Library.java");
		return temp;
	}
	public String getMethodId() {
		return "help";
	}
	public String getHelp() {
		return "Type help for showing application 's info";
	}
}
