import java.util.Scanner;

public class LongestRepeatingCharacterReplacement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		int ans = characterReplacement(str,k);
		System.out.print(ans);
	}
	private static int characterReplacement(String s, int k) {
		int maxLen =0, maxFreq = 0, right = 0, left =0;
		int[] hash = new int[26];
		while(right<s.length()){
			hash[s.charAt(right)-'A']++;
			maxFreq = Math.max(maxFreq,hash[s.charAt(right)-'A']);
			if((right-left+1)-maxFreq <=k){
				maxLen= Math.max(right-left+1, maxLen);
			}else{
				hash[s.charAt(left)-'A']--;
				left++;
			}
			right++;
		}	
		return maxLen;
	}
}