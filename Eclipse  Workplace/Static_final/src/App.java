class Thing {
	String name;
	static String description;
	final static int LUCKY_NUMBER = 112233;
	public static int count;

	public void showName() {
		System.out.println(name);
		System.out.println(description);
	}
	public static void showInfo() {
		System.out.println(description);
		// Won't Work     System.out.println(name);
	}
}

public class App {

	public static void main(String[] args) {
		
		Thing.description = "Hello Everyone!!!!";
		
		Thing.showInfo();
		
		System.out.println(Thing.LUCKY_NUMBER); 
		
		Thing thing1 = new Thing();
		thing1.name = "Niraj";
		
		thing1.showName();
		System.out.println(Thing.count); // Static and Object variable takes default value
		
		int count = 2; // Local variable can't take default value
		System.out.println(count);
		
		

	}

}
