import java.util.Scanner;

public class LongestPalindromicSubstring{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = longestPalindrome(str);
		System.out.print(ans);
	}
	private static String longestPalindrome(String s) {
		String maxString = "";
		for(int start = 0;start<s.length();start++){
			String oddLengthPalindrome = expand(s, start,start);
			String evenLengthPalindrome = expand(s,start,start+1);
			if(oddLengthPalindrome.length()>maxString.length()) maxString = oddLengthPalindrome;
			if(evenLengthPalindrome.length()>maxString.length()) maxString = evenLengthPalindrome;
		}
		return maxString;
	}
	private static String expand(String str, int left, int right){
		while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
			left--;
			right++;
		}			
		return str.substring(left+1,right);
	}
}