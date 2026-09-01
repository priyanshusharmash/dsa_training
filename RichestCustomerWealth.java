import java.util.Scanner;
public class RichestCustomerWealth{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] accounts = new int[m][n];
		for(int i =0;i<m;i++){
			for(int j =0;j<n;j++){
				accounts[i][j] = sc.nextInt();
			}
		}
		int ans = maximumWealth(accounts);
		System.out.println(ans);
		
	}
	private static int maximumWealth(int[][] accounts){
		int[] wealths = new int[accounts.length];
		for(int i =0;i<accounts.length;i++){
			for(int j =0;j<accounts[0].length;j++){
				wealths[i] += accounts[i][j];
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i =0;i<wealths.length;i++){
			max = Math.max(max,wealths[i]);
		}
		return max;
	}
}