package prototype.method;
import main.Temp;
import java.util.List;

public class MethodFactory {
	private Method method;
	public MethodFactory() {}
	public Temp executeMethod(Temp Temp, List<String> cmd) {
		setMethod(cmd.get(0), (Method[]) Temp.getAttr("MethodLibrary"));
		Temp.removeKey("error");
		return this.method.Execute(Temp, cmd);
	}
	public void setMethod(String key, Method[] list) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].getMethodId().equals(key)) {
				method = list[i];
				return;
			}
		}
		method = new MethodNotFound();
	}
}
