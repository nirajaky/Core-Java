import java.io.IOException;
import java.text.ParseException;


public class App1 {

	
	public static void main(String[] args) {
		
		Test test = new Test();
		
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 // in java 7 introduced
		 
		try {
			test.run();
		}
		catch(IOException | ParseException e) {
			e.printStackTrace();
		}
		*/
	}

}
