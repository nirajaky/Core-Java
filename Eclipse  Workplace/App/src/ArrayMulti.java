
public class ArrayMulti {

	public static void main(String[] args) {
		
		int grid[][] = {
				{1,2,3},
				{88,97},
				{7,89,65}
		};
		
		for(int row = 0; row<grid.length;row++) {
			{
				for(int col = 0;col< grid[row].length ; col++) {
					System.out.print(grid[row][col] + " ");
				}
				System.out.println();
			}
		}

	}

}
