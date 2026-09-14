import java.util.Scanner;
import java.util.Arrays;

public class RotateImage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] nums = new int[n][n];
		for(int i = 0;i<n;i++){
			for(int j =0;j<n;j++) nums[i][j] = sc.nextInt();
		}
		rotateImage(nums);
		for(int[] rows:nums)
		System.out.println(Arrays.toString(rows));
	}
	
	private static void rotateImage(int[][] nums){
		int top = 0,down =nums.length-1;
		while(top<down) {
			swapRows(nums, top, down);
			top++;
			down--;
		}
		down = nums.length-1;
		while(down>=0){
			swapRowCol(nums,down);
			down--;
		}
	}
	
	private static void swapRowCol(int[][] nums, int n){
		int j = n;
		while(j>=0){
			int temp = nums[n][j];
			nums[n][j] = nums[j][n];
			nums[j][n] = temp;
			j--;
		}
	}
	
	private static void swapRows(int[][] nums, int top, int down){
		int j =0, n =nums[0].length;
		while(j<n){
			int temp = nums[top][j];
			nums[top][j] = nums[down][j];
			nums[down][j] = temp;
			j++;
		}
	}
}