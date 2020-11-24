public class Main {

    public static void main(String[] args) {
	// write your code here
        Machine mech1 = new Machine();
        mech1.start();
        mech1.stop();

        Car car = new Car();
        car.start();
        car.wipeOut();
        car.showInfo();
        car.stop();

    }
}
