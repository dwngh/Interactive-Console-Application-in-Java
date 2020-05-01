package prototype.method;

import prototype.method.file.CreateFile;
import prototype.method.file.WriteFile;
import prototype.method.file.SaveFile;

public class Library {
	public static Method[] list() {
		
		// Adding a new class implemented "Method" interface here
		return {
 				new Help(), 
				// new Method()
 		};
	};
}
