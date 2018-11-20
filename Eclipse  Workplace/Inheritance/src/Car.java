public class Car extends Machine {
	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car Started");
	}

	public void wipeWindShield() {
		
		System.out.println("Wiping wind Shield");
		
		System.out.println(name);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.close();
	}
	
	

}
