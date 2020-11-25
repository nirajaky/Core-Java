import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Adding to ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("#Iteration @1");
        for(var i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("#Iteration @2");
        for(var value: list){
            System.out.println(value);
        }

        // Revoing from ArrayList
        list.remove(0);
        list.remove(list.size()-1);

        System.out.println("#Iteration @3 after removing");
        list.forEach(i -> System.out.println(i));
    }
}
