
public class Robot {
	private int id;
	
	class Brain {
		public void think(){
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	
	public static class Battery {
		public void charge(){
			System.out.println("Battery Charging.. ");
		}
	}
	Robot(int id){
		this.id = id;
	}
	
	public void start(){
		final String abc = "cbsd";
		System.out.println("Starting Robot " + id);
		
		Brain brain = new Brain();
		brain.think();
		
		class nn {
			public void info(){
				System.out.println(abc);   // abc must be final
			}
		}
	}
}
