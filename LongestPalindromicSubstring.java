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
			String window = "";
			for(int end = start;end<s.length();end++){
				window += s.charAt(end);
				if(checkPalindrome(window)){
					if(window.length()>maxString.length()) maxString = window;
				}
			}
		}
		return maxString;
	}
	private static boolean checkPalindrome(String str){
		for(int i =0;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
		}
		return true;
	}
}