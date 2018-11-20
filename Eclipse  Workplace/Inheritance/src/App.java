
public class App {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		
		mach1.start();
		mach1.close();
		
		Car car = new Car();
		car.start();
		car.wipeWindShield();
		car.close();
		
		System.out.println(mach1.name);
		
		
		
	}

}
