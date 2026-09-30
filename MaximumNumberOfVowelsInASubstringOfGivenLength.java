import java.util.Scanner;

public class MaximumNumberOfVowelsInASubstringOfGivenLength{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		int ans = maxVowels(str, k);
		System.out.print(ans);
	}
	private static int maxVowels(String s, int k) {
		int left =0,right=0,count =0,currentCount=0;
		while(right<s.length()){
			char currentChar = s.charAt(right);
			if(isVovel(currentChar)) currentCount++;
			if(right-left+1 == k){
				count = Math.max(count,currentCount);
				if(count == k) return k;
				if(isVovel(s.charAt(left))) currentCount--;
				left++;
			}
			right++;
		}
		return count;
	}
	private static boolean isVovel(char ch){
		if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
		return false;
	}
}