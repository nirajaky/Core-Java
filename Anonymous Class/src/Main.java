class Machine{
    public void start(){
        System.out.println("Machine Started");
    }
}

interface Plant{
    public void grow();
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Machine m1 = new Machine(){
            @Override
            public void start() {
                System.out.println("Camera Starting");
            }
        };

        m1.start();

        Plant p1 = new Plant(){
            @Override
            public void grow() {
                System.out.println("Plant Growing");
            }
        };

        p1.grow();
    }
}
