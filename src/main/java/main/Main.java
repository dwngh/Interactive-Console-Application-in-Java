package main;
import prototype.Listener;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listener listener = new Listener();
		Temp temp = listener.generateTemp();
		introduce();
		while (!temp.isExpired()) {
			temp = listener.listen(temp);
		}
		System.out.println("Terminated...");
	}
	
	public static void introduce() {
		System.out.println("Welcome !!");
		System.out.println("New here? Type 'help' for some info");
	}
}
