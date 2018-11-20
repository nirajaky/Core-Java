
public class App {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		plant.grow();
		
		Tree tree = new Tree();
		tree.grow();
		
		Plant plant1 = tree;  // Making referance to Tree type Object
		plant1.grow();
		
		System.out.println("--------------");
		tree.shedLeaves();
		// Won't Work  ->  plant1.shedLeaves();

	}

}
