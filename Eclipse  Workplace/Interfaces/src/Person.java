
public class Person implements Info{
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("Hello There");
	}
	public void showInfo() {
		
		System.out.println("Id no. = " + name);
		
	}

}
