import java.util.Scanner;
public class FindTheDifference{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.nextLine();
		String t = sc.next();
		char ans = findTheDifference(s,t);
		System.out.print(ans);
	}
	private static char findTheDifference(String s, String t) {
        int[] arr = new int[26];
		for(int i =0;i<s.length();i++){
			arr[s.charAt(i)-'a'] ++;
			arr[t.charAt(i)-'a'] --;
		}
		char lastChar = t.charAt(t.length()-1);
		arr[lastChar-'a'] --;
		for(int i =0;i<arr.length;i++){
			if(arr[i] != 0) return (char) (i + 97);
		}
		return 'a';
    }
}