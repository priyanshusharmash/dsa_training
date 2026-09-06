import java.util.Scanner;
public class RansomNote{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String r = sc.next();
		String m = sc.next();
		boolean ans = canConstruct(r,m);
		System.out.print(ans);
	}
	private static boolean canConstruct(String ransomNote,String magazine){
		int[] freq = new int[26];
		for(int i =0;i<magazine.length();i++) freq[magazine.charAt(i)-97]+=1;
		for(int i =0;i<ransomNote.length();i++) freq[ransomNote.charAt(i)-97]-=1;
		for(int num:freq) {
			if(num<0) return false;
		}
		return true;
	}
}