import java.util.Scanner;
public class ValidPalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean ans = isPalindrome(s);
		System.out.print(ans);
	}
	private static boolean isPalindrome(String s){
		String str ="";
		for(int i =0;i<s.length();i++){
			char ch = Character.toLowerCase(s.charAt(i));
			if(Character.isLetterOrDigit(ch)) str+=ch;
		}
		int low =0,high=str.length()-1;
		while(low<high){
			if(str.charAt(low++)!=str.charAt(high--)) return false;
		}
		return true;
	}
}