import java.util.Scanner;

class Person {
	private String name;
	int age;

	void setName(String name) {
		this.name = name;
	}

	void speak() {
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
	}

	int calc() {
		return (65 - age);
	}

	int getAge() {
		return age;
	}
}

public class Appl {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Neeraj");
		p1.age = 22;
		p1.speak();
		System.out.println("Age = " + p1.getAge());
		System.out.println("Year of Retirement = " + p1.calc());
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line: ");
		String line = input.nextLine();
		System.out.print("  " + line);
		

	}

}
