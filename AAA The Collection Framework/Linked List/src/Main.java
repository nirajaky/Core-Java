import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Java 10 features List, List is an interface(it needs to be imported before using
        List<Integer> linkedList = new LinkedList<Integer>();

        // Java 11 introduced var, here var is an identifier not an keyword
        var arrayList = new ArrayList<Integer>();

        // Old way of doing
        //LinkedList<Integer> list = new LinkedList<Integer>();

        //linkedList.add(10);


        dotiming("LinkedList", linkedList);
        dotiming("ArrayList", arrayList);

        int size = linkedList.size();
        System.out.println(size);
        int size1 = arrayList.size();
        System.out.println(size1);
    }
    public static void dotiming(String str, List list){
        for(var i=0; i<1E5; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for(var i=0; i<1E5; i++){
            list.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(str + " took " + (end-start) + " milli second");
    }
}
