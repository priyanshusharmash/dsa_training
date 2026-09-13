import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] nums = new int[n][m];
		for(int i =0;i<n;i++){
			for(int j=0;j<m;j++) nums[i][j]=sc.nextInt();
		}
		List<Integer> ans = spiralMatrix(nums);
		System.out.print(ans.toString());
	}
	
	private static List<Integer> spiralMatrix(int[][]nums){
		List<Integer> list = new ArrayList<>();
		int rowStart = 0, rowEnd = nums.length-1,colStart = 0, colEnd = nums[0].length-1;
		while(rowStart<=rowEnd && colStart<=colEnd){
			for(int i = colStart;i<=colEnd;i++) list.add(nums[rowStart][i]);
			rowStart++;
			
			for(int i =rowStart;i<=rowEnd;i++) list.add(nums[i][colEnd]);
			colEnd--;
			
			if(rowStart<=rowEnd){
				for(int i =colEnd;i>=colStart;i--) list.add(nums[rowEnd][i]);
				rowEnd--;
			}
			if(colStart<=colEnd){
				for(int i =rowEnd;i>=rowStart;i--) list.add(nums[i][colStart]);
				colStart++;
			}
		}
		return list;
	}
}