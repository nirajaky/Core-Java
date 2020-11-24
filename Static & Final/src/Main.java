class Thing {
    public String name;
    public static String description;
    public final static int LUCKY_NUMBER = 7;

    public void showName(){
        description = "This is a Thing";
        System.out.println(description + " : " + name);
    }

    public static void showInfo(){
        description = "***************";
        System.out.println("Heelo!! This is staic Method");
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thing.description = "I am a Thing";

        Thing.showInfo();

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bat";
        thing2. name = "Ball";

        thing1.showName();
        thing2.showName();

        thing1.showInfo();

        System.out.println(Thing.description);

        System.out.println("Lucky Number is " + Thing.LUCKY_NUMBER);

    }
}
