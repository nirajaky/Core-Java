
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(7);
		robot.start();
		
		Robot.Brain br = robot.new Brain();				// public class only
		br.think();
		
		Robot.Battery battery = new Robot.Battery();	// static class 
		battery.charge();
	}

}
