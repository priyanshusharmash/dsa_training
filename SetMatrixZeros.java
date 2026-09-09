import java.util.Scanner;
import java.util.Arrays;
public class SetMatrixZeros{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] nums = new int[m][n];
		for(int i =0;i<m;i++){
			for(int j = 0;j<n;j++) nums[i][j] = sc.nextInt();
		}
		setZeros(nums);
		for(int i = 0;i<m;i++) System.out.println(Arrays.toString(nums[i]));
	}
	private static void setZeros(int[][] matrix){
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];
		for(int i =0;i<matrix.length;i++){
			for(int j =0;j<matrix[0].length;j++){
				if(matrix[i][j] == 0){
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for(int i =0;i<matrix.length;i++){
			for(int j =0;j<matrix[0].length;j++){
				if(row[i]==1 || col[j]==1) matrix[i][j] = 0;
			}
		}
	}
}