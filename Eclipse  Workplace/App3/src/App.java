class Person {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
		System.out.println("Hello");
	}
	public void setAge(int age) {
		this.age = age;
		//setName("Sonu");
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
}
public class App {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("Niraj");
		p.setAge(20);
		String name = p.getName();
		int age = p.getAge();
		
		System.out.println(name);
		System.out.println(age);
		

	}

}
