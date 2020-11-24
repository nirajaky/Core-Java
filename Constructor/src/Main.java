class Machine {
    private String name;
    private int code;
    public Machine(){
        this("From First");
        System.out.println("First Constructor Running");
    }
    public Machine(String name){
        this("From First", 10);
        System.out.println("Second Constructor Running");
        this.name = name;
    }
    public Machine(String name, int code){
        System.out.println("Third Constructor Running");
        this.name = name;
        this.code = code;
    }
    public void showInfo(){
        //Machine();
        System.out.println("Show Info Method");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Machine m1 = new Machine();

        Machine m2 = new Machine("Annie");

        Machine m3 = new Machine("Annie", 7);

    }
}
