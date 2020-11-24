import java.util.Objects;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return name + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


    public class Main {

    public static void main(String[] args) {
	// write your code here

        Person p1 = new Person(5, "bob");
        Person p2 = new Person(5, "bob");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1 == p2);      // false
        System.out.println(p1.equals(p2)); // true

        int a = 10;
        int b = 10;
        System.out.println("For non-primitive " + (a == b)); // true ; a.equals(b) won't work here

        Integer c = 10;
        Integer d = 10;
        System.out.println("For Integer " + (c == d));        // true
        System.out.println("For Integer " + c.equals(d));     // true

        Byte e = 10;
        Byte f = 10;
        System.out.println("For Byte " + (e == f));        // true
        System.out.println("For Byte " + e.equals(f));     // true

        Double x = 10.0;
        Double y = 10.0;
        System.out.println("For Double " + (x == y));        // false:Beacuse after certain decimal place the value for both address is different
        System.out.println("For Double " + x.equals(y));     // true

        String t1 = "Hello";
        String t2 = "Hello";
        String t3 = "HelloWorld".substring(0,5);
        //System.out.println(t3);
        System.out.println("For String " + (t1 == t2));        // true, but bad practice always do .equals for Reference type
        System.out.println("For String " + t1.equals(t2));     // true

        System.out.println("For String " + (t1 == t3));        // false, bad practice always do .equals for Reference type
        System.out.println("For String " + t1.equals(t3));     // true
    }
}
