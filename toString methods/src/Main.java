class Frog{
    private String name;
    private int id;
    public Frog(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        //StringBuilder sb = new StringBuilder();
        //sb.append(id).append(" ").append(name);
        //return sb.toString();

        //////////////OR////////////////////////

        return String.format("%d : %s", id, name); 
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here

        Frog f1 = new Frog("Annie", 7);
        Frog f2 = new Frog("Berti", 11);

        System.out.println(f1);
        System.out.println(f2);

    }
}
