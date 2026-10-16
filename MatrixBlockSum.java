import java.util.Scanner;
import java.util.Arrays;

public class MatrixBlockSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] mat = new int[row][col];
		for(int i =0;i<row;i++){
			for(int j =0;j<col;j++) mat[i][j] = sc.nextInt();
		}
		int k = sc.nextInt();
		int[][] ans = matrixBlockSum(mat,k);
		for(int i =0;i<ans.length;i++) System.out.println(Arrays.toString(ans[i]));
	}
	private static int[][] matrixBlockSum(int[][] mat, int k) {
		int[][] prefix = generatePrefixSum(mat);
		int maxCol,minCol,maxRow,minRow;
		for(int i =0;i<mat.length;i++){
			minRow = i-k-1;
			maxRow = Math.min(i+k,mat.length-1);
			for(int j =0;j<mat[0].length;j++){
				minCol = j-k-1;
				maxCol = Math.min(j+k,mat[0].length-1);
				if(minRow < 0){
					if(minCol <0) mat[i][j] = prefix[maxRow][maxCol];
					else mat[i][j] = prefix[maxRow][maxCol]-prefix[maxRow][minCol];
				}else if(minCol<0){
					mat[i][j] = prefix[maxRow][maxCol]-prefix[minRow][maxCol];
				}else{
					mat[i][j] = prefix[maxRow][maxCol]-prefix[minRow][maxCol] - prefix[maxRow][minCol]+prefix[minRow][minCol];
				}
			}
		}
		return mat;
	}
	private static int[][] generatePrefixSum(int[][] mat){
		int[][] ans = new int[mat.length][mat[0].length];
		int sum =0,prefix=0;
		for(int i =0;i<mat.length;i++){
			prefix=0;
			for(int j =0;j<mat[0].length;j++){
				prefix+=mat[i][j];
				if(i==0) ans[i][j] = prefix;
				else ans[i][j] = ans[i-1][j] + prefix;
			}
		}
		return ans;
	}
}