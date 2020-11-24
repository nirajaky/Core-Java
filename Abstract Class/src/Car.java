public class Car extends Machine{
    @Override
    public void start() {
        System.out.println("Car Starting");
    }
    @Override
    public void doStuff() {
        System.out.println("Car Running");
    }
    @Override
    public void stop() {
        System.out.println("Car Stopping");
    }
}
