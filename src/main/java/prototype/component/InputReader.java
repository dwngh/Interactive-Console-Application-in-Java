package prototype.component;
import java.util.Scanner;
import java.util.ArrayList;

public class InputReader {
	Scanner input;
	public InputReader() {
		input = new Scanner(System.in);
	}
	
	// Using this method if you want to slice a string into a list of words or custom this method
	public ArrayList<String> read(char SeparateCharacter){
		String inp = takingInput();
		ArrayList<String> list = new ArrayList<String>();
		if (!inp.isEmpty()) {
			String temp = "";
			for (int i = 0;i < inp.length();i++) {
				if (inp.charAt(i) == SeparateCharacter) {
					list.add(temp);
					temp = "";
				} else temp = temp + inp.charAt(i);
			}
			list.add(temp);
		}
		return list;
	}
	public static ArrayList<String> read(String s, char SeparateCharacter){
		ArrayList<String> list = new ArrayList<String>();
		if (!s.isEmpty()) {
			String temp = "";
			for (int i = 0;i < s.length();i++) {
				if (s.charAt(i) == SeparateCharacter) {
					list.add(temp);
					temp = "";
				} else temp = temp + s.charAt(i);
			}
			list.add(temp);
		}
		return list;
	}
	public String takingInput() {
		System.out.print("# ");
		String str = input.nextLine();
		if (!this.validateInput(str) str = input.nextLine();
		return str;
	}
	
	// Adding condition to input
	public boolean validateInput(String str) {
		return true;
	}
	
	// The default separating char is ' ' (space)
	public ArrayList<String> read(){
		return read(' ');
	}
}
