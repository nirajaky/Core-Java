import java.util.ArrayList;

class Machine{
    public String toString(){
        return "I am a Machine";
    }
    public void start(){
        System.out.println("Machine started");
    }
}
class Camera extends Machine{
    public String toString(){
        return "I am a Camera";
    }
    public void start(){
        System.out.println("Camera started");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Machine> list1 = new ArrayList<>();

        list1.add(new Machine());
        list1.add(new Machine());
        list1.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<>();

        list2.add(new Camera());
        list2.add(new Camera());
        list2.add(new Camera());

        showInfo(list2);
    }
    public static void showInfo(ArrayList<?> list){
        for(Object text : list){
            System.out.println(text);
            //text.start();
        }
    }
}
