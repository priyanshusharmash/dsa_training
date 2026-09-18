import java.util.Scanner;
import java.util.Arrays;

public class PermutationInString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		boolean ans = checkInclusion(s1,s2);
		System.out.print(ans);
	}
	private static boolean checkInclusion(String s1, String s2) {
		if(s2.length()<s1.length()) return false;
		int left =0,right =0;
		int[] freq = new int[26];
		int[] currentFreq = new int[26];
		for(char ch : s1.toCharArray()) freq[ch -'a']++;
		while(right<s2.length()){
			currentFreq[s2.charAt(right)-'a']++;
			if(Arrays.equals(freq,currentFreq)) return true;
			if(right-left+1 == s1.length()){
				currentFreq[s2.charAt(left)-'a']--;
				left++;
			}
			right++;
		}
		return false;
	}
}