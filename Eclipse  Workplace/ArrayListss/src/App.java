import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class App {
    public static void main(String args[]){
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Cat");
        myList.add("Dog");
        myList.add("parrot");
        myList.add(2,"Bird");

        System.out.println(myList.get(2));
        /*
        HashSet<String> sets = new HashSet<String>();
        sets.add("Cat");
        sets.add("Dog");
        sets.add("parrot");
        sets.add("Cat");
        //System.out.println(sets.get(2))
          */
         
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        
        myHashMap.put("A", "Apple");
        myHashMap.put("B", "Ball");
        myHashMap.put("C", "Cat");
        myHashMap.put("D", "Dog");
        
        System.out.println(myHashMap.get("B"));
        
        HashMap<String, HashMap<String, String>> myNewHashMap = new HashMap<String, HashMap<String, String>>();
        
        myNewHashMap.put("E", myHashMap);
        System.out.println(myNewHashMap.get("E"));
        
        
    }
}
