class Person
{
	String name;
	int age;
	
}

public class App2 {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Neeraj";
		p1.age = 20;
		
		Person p2 = new Person();
		p2.name ="Joe";
		p2.age = 33;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}
}
