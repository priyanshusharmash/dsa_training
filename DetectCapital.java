import java.util.Scanner;
public class DetectCapital{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ans = detectCapital(s);
		System.out.print(ans);
	}
	
	private static boolean detectCapital(String word){
		if(word.equals(word.toLowerCase())) return true;
		if(word.equals(word.toUpperCase())) return true;
		if(word.charAt(0)<'a' && word.substring(1).equals(word.substring(1).toLowerCase())) return true;
		return false;
	}
	//optimized
	/*
	private static boolean detectCapital(String word){
		int capitals=0;
		for(char c :word.toCharArray()){
			if(c<'a') capitals++;
		}
		return capitals == 0 || capitals == word.length() || (capitals==1 && word.charAt(0)<'a');
	}
	*/
}