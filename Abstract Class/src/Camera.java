public class Camera extends Machine{
    @Override
    public void start(){
        System.out.println("Camera Starting");
    }
    @Override
    public void doStuff() {
        System.out.println("Camera Running");
    }
    @Override
    public void stop() {
        System.out.println("Camera Stopping");
    }
}
