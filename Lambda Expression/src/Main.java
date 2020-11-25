interface Executable{
    int execute();
}
class Runner {
    public void run(Executable e){
        System.out.println("Executing the code...");
        int value = e.execute();
        System.out.println("Returned Value is : " + value);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Runner runner = new Runner();

        ////////////Before LAMBDA EXPRESSION WAS INTODUCED////////////////
        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello There");
                return 7;
            }
        });
        System.out.println("============================================");
        /////////////////////USING LAMBDA EXPRESSION /////////////////////

        runner.run(() -> {
            System.out.println("This is a code in LAMBDA EXPRESSION WAY");
            System.out.println("Hello There");
            return 10;
        });
    }
}
