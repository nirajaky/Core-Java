import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // HashSet does not maintains the order
        Set<String> set1 = new HashSet<String>();

        // Maintans the order in which it is entered
        Set<String> set2 = new LinkedHashSet<String>();

        // Natural Ordering
        Set<String> set3 = new TreeSet<String>();

        set1.add("Cat");
        set1.add("Dog");
        set1.add("Mouse");
        set1.add("Snake");
        set1.add("Bear");

        // Adding a duplicate items does Nothing
        set1.add("mouse");

        set2.add("Elephant");
        set2.add("Girraff");
        set2.add("Mouse");
        set2.add("Snake");
        set2.add("Cow");

        set3.add("Cat");
        set3.add("Dog");
        set3.add("Mouse");
        set3.add("Snake");
        set3.add("Bear");

        System.out.println(set1);
        System.out.println("*********************");
        System.out.println(set2);
        System.out.println("*********************");
        System.out.println(set3);
        System.out.println("*********************");

        // Iteration
        set3.forEach(i -> System.out.println(i));

        // Does set contains given items
        if(set1.contains("cow")){
            System.out.println("Se1 contains cow");
        } else if(set1.contains("mouse")){
            System.out.println("set1 contains mouse");
        }

        System.out.println("*********************");
        // Replace set1 with only common elements: Intersection(Common values)
        set1.retainAll(set2);
        System.out.println(set1);

        System.out.println("*********************");
        // set2 - set3: Difference
        set2.removeAll(set3);
        System.out.println(set2);

    }
}
