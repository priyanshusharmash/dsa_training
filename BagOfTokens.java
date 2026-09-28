import java.util.Scanner;
import java.util.Arrays;

public class BagOfTokens{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] tokens = new int[n];
		for(int i =0;i<n;i++) tokens[i] = sc.nextInt();
		int power = sc.nextInt();
		int ans = bagOfTokensScore(tokens,power);
		System.out.print(ans);
	}
	private static int bagOfTokensScore(int[] tokens, int power) {
		Arrays.sort(tokens);
		int low =0,high=tokens.length-1,currentScore=0,score=0;
		while(low<=high){
			
			if(power>=tokens[low]){
				currentScore +=1;
				power-=tokens[low];
				low++;
                score = Math.max(score,currentScore);
			}else if(currentScore>0){
				currentScore-=1;
				power+=tokens[high];
				high-=1;
			}else{
				break;
			}
		}
		return score;
	
	}
}