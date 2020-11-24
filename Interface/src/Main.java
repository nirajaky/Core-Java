public class Main {

    public static void main(String[] args) {
	// write your code here
        Machine mach1 = new Machine();
        mach1.start();
        mach1.showInfo();

        Person p1 = new Person("Bob");
        p1.greet();
        p1.showInfo();

        System.out.printf("%.1f", 11.95);
    }
}
