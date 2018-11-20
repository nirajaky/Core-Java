class Machine {
	
	public void start() {
	System.out.println("Machine Starting");
	}
	
}
interface Plant {
	public void grow();
}
public class App {

	
	public static void main(String[] args) {
		
		Machine machine1 = new Machine() {
			public void start() {
				System.out.println("Camera Snapping...");
			}
		};
		
		machine1.start();
		
		Plant plant1 = new Plant() {
			public void grow() {
				System.out.println("Plant Growing...");
			}
		};
		plant1.grow();

	}

}
