public class Car extends Machine{
    public void wipeOut(){
        System.out.println("Wiping Car");
    }

    @Override
    public void start() {
        System.out.println("Car Starting");
        // To call parent Class Merthods: super.start();
    }
    public void showInfo(){
        System.out.println("Car Name : " + name);
    }
}
