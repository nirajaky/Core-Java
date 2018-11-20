class Thing {
	private String name;
	public static String desc;
	public final static int L_NUM = 12;
	
	void setName(String name){
		this.name = name;
	}
	void showName() {
		System.out.println(desc + " : " + name);
	}
	static void showInfo() {
		System.out.println(desc);
	}
}
public class App {
	public static void main(String[] args) {
		Thing t1 = new Thing();
		
		Thing.desc = "Hyyy";
		
		t1.setName("Niraj");
		t1.showName();
		t1.showInfo();
		
		System.out.println("Lucky Number = " + Thing.L_NUM);
		
		String a = "Hihi" + "hh" + 7;
		System.out.println(a);
	}

}
