import java.util.Scanner;

public class CountNegativeNumbersInASortedMatrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] nums = new int[row][col];
		for(int i =0;i<row;i++){
			for(int j =0;j<col;j++) nums[i][j]=sc.nextInt();
		}
		int ans = countNegatives(nums);
		System.out.print(ans);
	}
	
	private static int countNegatives(int[][] grid) {
		int count =0;
		for(int i =0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				if(grid[i][j] < 0) {
					count+= (grid[0].length-j);
					break;
				}
			}
		}
		return count;
	}
}