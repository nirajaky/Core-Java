import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {
	// write your code here
        String fileName = "C:\\Users\\niraj\\OneDrive\\Desktop\\text.txt";

        File in = new File(fileName);

        Scanner sc = new Scanner(in);
        int num = sc.nextInt();
        System.out.println("Num is " + num);
        sc.nextLine();
         
        while(sc.hasNextLine()){

            String text = sc.nextLine();

            System.out.println(text);
        }
        sc.close();
    }
}
