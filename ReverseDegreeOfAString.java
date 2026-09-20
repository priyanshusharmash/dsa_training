import java.util.Scanner;

public class ReverseDegreeOfAString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = reverseDegree(s);
		System.out.print(ans);
	}
	private static int reverseDegree(String s){
		int sum = 0;
		for(int i =0;i<s.length();i++){
			char currentChar = s.charAt(i);
			int currentReverseDegree = 'z'-(currentChar-'a')-'a'+1;
			sum+= currentReverseDegree*(i+1);
		}
		return sum;
	}
}