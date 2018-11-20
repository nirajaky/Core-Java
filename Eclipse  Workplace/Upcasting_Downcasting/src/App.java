class Machine {
	public void start() {
		System.out.println("Machine Started");
	}
}
class Camera extends Machine {
	public void start() {
		System.out.println("Camera Started");
	}
	public void snap() {
		System.out.println("Snap Taken");
	}
}
public class App {

	
	public static void main(String[] args) {
		
		Machine m1 = new Machine();
		m1.start();
		Camera c1 = new Camera() ;
		c1.start();
		
		//upcasting   Also Polymorphism
		Machine m2 = c1;
		m2.start();
		//Won't work   -->  m2.snap();
		
		System.out.println("---------------------------");
		
		//downcasting
		Machine m3 = c1;
		Camera c2 = (Camera)m3;
		c2.snap();
		c2.start();
		
		
		
	}

}
