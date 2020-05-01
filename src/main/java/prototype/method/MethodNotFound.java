package prototype.method;

import java.util.List;
import main.Temp;

public class MethodNotFound implements Method {

	public Temp Execute(Temp temp, List<String> cmd) {
		// TODO Auto-generated method stub
		System.out.println("Method not found, please check your command again!!");
		return temp;
	}

	public String getMethodId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}

}
