import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println("*********************");
        testMap(hashMap);                             // Random Order
        System.out.println("*********************");
        testMap(linkedHashMap);                       // Natural Order
        System.out.println("*********************");
        testMap(treeMap);                             // Acending Order
        System.out.println("*********************");

    }
    public static void testMap(Map<Integer, String> map){
        map.put(1, "One");
        map.put(4, "Four");
        map.put(11, "Eleven");
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(7, "Seven");
        map.put(17, "Seventeen");

        map.forEach((i, s) -> System.out.println(i + ": " + s));
    }
}
