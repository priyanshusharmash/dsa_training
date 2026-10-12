import java.util.Scanner;
import java.util.Arrays;
public class RangeSumQueryTwoDImmutable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] nums = new int[rows][cols];
		for(int i =0;i<rows;i++){
			for(int j =0;j<cols;j++) nums[i][j] = sc.nextInt();
		}
		
		System.out.print("Cases: ");
		int cases = sc.nextInt();
		int[][] arr = new int[cases][4];
		for(int i =0;i<cases;i++){
			for(int j = 0;j<4;j++) arr[i][j] = sc.nextInt();
		}
		
		
		NumMatrix obj = new NumMatrix(nums);
		
		for(int i =0;i<cases;i++){
			int ans = obj.sumRegion(arr[i][0], arr[i][1],arr[i][2],arr[i][3]);
			System.out.println(ans);
		}
		
	}
	
}
class NumMatrix{
	private int[][] prefix = new int[200][200];
	public NumMatrix(int[][] matrix) {
		for(int row =0;row<matrix.length;row++){
			int sum =0;
			for(int col =0;col<matrix[0].length;col++){
				sum+=matrix[row][col];
				if(row == 0){
					prefix[row][col] = sum;
				}else{
					prefix[row][col] = sum+prefix[row-1][col];
				}
			}
		}
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1==0){
			if(col1==0) return prefix[row2][col2];
			return prefix[row2][col2]-prefix[row2][col1-1];
		}
		else if(col1==0){
			return prefix[row2][col2]-prefix[row1-1][col2];
		}else return prefix[row2][col2]-prefix[row2][col1-1]-(prefix[row1-1][col2]-prefix[row1-1][col1-1]);
    }
}