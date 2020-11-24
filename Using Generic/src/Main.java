import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> list = new ArrayList<>();
        for(int i =1; i<=5; i++){
            list.add("Apple");
        }
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
