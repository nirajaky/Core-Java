import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) {
		String fileName = "text.txt";
		
		File file = new File(fileName);
		
		try {
			FileReader fr = new FileReader(file);
		}
		catch(FileNotFoundException ff) {
			System.out.println("No file found");
			ff.printStackTrace();
		} 
		
		
	}

}
