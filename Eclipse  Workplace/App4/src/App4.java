class Machine {
	String name;
	int code;
	
	Machine() {
		System.out.println("First constructor Running");
	}
	Machine(String name) {
		this("Niraj",20);
		System.out.println("Second constructor Running");
		this.name = name;
	}
	Machine(String name, int code) {
		System.out.println("Third constructor Running");
		this.name = name;
		this.code = code;
	}
	void display() {
		System.out.println("Name :" + name);
		System.out.println("code :" + code);
	}
	
}
public class App4 {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		//machine1.display();
		Machine machine2 = new Machine("Sonu");
		machine2.display();
		
		
	}

}
