package prototype;
import prototype.component.InputReader;
import prototype.component.LogPrinter;

import java.util.ArrayList;
import main.Temp;
import prototype.method.MethodFactory;
import prototype.method.Library;

public class Listener {
	private InputReader input;
	private ArrayList<String> cmd;
	private MethodFactory Factory = new MethodFactory();
	public Listener() {
		input = new InputReader();
	}
	public Temp generateTemp() {
		Temp s = new Temp();
		s.addAttr("MethodLibrary", Library.list());
		return s;
	}
	public Temp listen(Temp temp) {
		System.out.println("");
		cmd = input.read();
		if (!cmd.isEmpty()) {
			temp = Factory.executeMethod(temp, cmd);
			if (temp.isExisted("error")) LogPrinter.print("ERROR: " + (String)temp.getAttr("error"));

		}
		return temp;
	}
}
