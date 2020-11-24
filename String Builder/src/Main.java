public class Main {

    public static void main(String[] args) {
        // write your code here
        String info = "";
        info += "This is Niraj Mehta.";
        info += " ";
        info += "I am a Programmer";

        System.out.println(info);

        StringBuilder sb = new StringBuilder();

        sb.append("My name is Niraj kumar.");
        sb.append(" I am a Gamer");

        System.out.println(sb.toString());

        //////////// Formating Strings //////////////

        System.out.printf("This is number %-5d and and its double is %5.2f", 5, Math.sqrt(100)); // . is also counted

    }
}
