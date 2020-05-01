package main;
import java.util.Map;
import java.util.HashMap;

public class Temp {
	private boolean expired;
	private Map<String, Object> Attr = new HashMap<String, Object>();
	public Temp() {
		expired = false;
	}
	public boolean isExpired() {
		return expired;
	}
	public void terminate() {
		expired = true;
	}
	public Object getAttr(String Key) {
		return Attr.get(Key);
	}
	public void addAttr(String key, Object value) {
		Attr.put(key, value);
	}
	public boolean isExisted(String key) {
		return Attr.containsKey(key);
	}
	public void removeKey(String key) {
		Attr.remove(key);
	}
}
