import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // Java 11 - var : of declaration
        var map2 = new HashMap<String, Integer>();
        ///////////////
        map2.put("one", 1);
        int a = map2.get("one");
        System.out.println(a);
        ///////////////
        
        // Adding to the List
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(9, "Nine");
        map.put(1, "One");
        map.put(-1, "Negative One");

        map.remove(-1);

        System.out.println(map.get(-2));
        System.out.println(map);
        System.out.println(map.size());

    }
}
