
public class App {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.start();
		mach1.showInfo();
		System.out.println(Machine.ID);
		
		Person p1 = new Person("Niraj");
		p1.speak();
		p1.showInfo();
		
		Info info1 = new Machine();
		info1.showInfo();
		Info info2 = p1;
		info2.showInfo();
	}

}
