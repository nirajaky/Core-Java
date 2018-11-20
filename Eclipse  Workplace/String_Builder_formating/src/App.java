/*
class StringBuilder {

	public String name;

	public StringBuilder() {
		name = "";
	}

	public void append(String name) {
		this.name += name ;
	}

	public String toString() {
		return name;
	}

}
*/

public class App {

	public static void main(String[] args) {
		
		///////////////////BUILDER///////////////////

		String info = "";

		info = "Niraj  ";
		info += "Sonu";

		System.out.println(info);
		
		// Memory Efficient
		StringBuilder sb = new StringBuilder();

		sb.append("Hello");
		sb.append(" ");
		sb.append("Everyone");  // Concatenation

		System.out.println(sb.toString());

		StringBuilder sb1 = new StringBuilder();

		sb1.append("I am a thing")
		.append(" ")               ///// this is not working in primitive type void return type
		.append("!!!!You Know");
		
		////////////////FORMATING/////////////////

		System.out.println(sb1.toString());
		
		System.out.printf("You have %-10d; \nand he have %d\n",12,23);
		
		for(int i = 1;i<=20;i++) {
			System.out.printf("%2d: %s \n",i,"some text here");
		}
		
		/////Formating float type
		System.out.printf("Value %f \n",4.556);
		System.out.printf("Value %.2f \n",4.556);
		System.out.printf("Value %4.1f \n",4.556);

	}

}
