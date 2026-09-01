import java.util.Scanner;
public class DivisorGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = divisorGame(n);
		System.out.println(ans);		
	}
	private static boolean divisorGame(int n){
		boolean[] dp = new boolean[n+1];
		for(int i = 2;i<=n;i++){
			for(int x =(int) Math.sqrt(i);x>0;x--){
				if(i%x == 0){
					if(dp[i-x] == false){
						dp[i] = true;
						break;
					}
				}
			}
		}
		return dp[n];
	}
}