import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		//String fileName = "C:/Users/Lenovo/Desktop/NirajScanner.txt"; 
		String fileName = "NirajScanner.txt"; 
		
		//System.out.println(fileName);
		 
		File textFile = new File(fileName);  
		
		Scanner in = new Scanner(textFile);
		
		int value = in.nextInt();
		System.out.println(value);
		
		in.nextLine();
		int count = 2;
		while(in.hasNextLine()) {
			String str = in.nextLine(); 
			System.out.println(count + ":" +str);
			count++;
		}
		
		in.close();

	}

}
