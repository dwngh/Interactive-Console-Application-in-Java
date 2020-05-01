package prototype.method;
import java.util.List;
import main.Temp;

public interface Method {
	public Temp Execute(Temp temp, List<String> cmd);
	public String getMethodId();
	public String getHelp();
}
