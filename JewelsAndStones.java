import java.util.Scanner;
public class JewelsAndStones{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String j = sc.next();
		sc.nextLine();
		String s = sc.next();
		int ans = numJewelsInStones(j,s);
		System.out.print(ans);
	}
	private static int numJewelsInStones(String jewels, String stones){
		int[] arr = new int[52];
		for(char c : jewels.toCharArray()){
			if(c>='a') arr[c-'a']++;
			else arr[c-'A' +26]++;
		}
		int count =0;
		for(char c : stones.toCharArray()){
			int index= c>='a'? c-'a' : c-'A' +26;
			if(arr[index]==1) count++;
		}
		return count;
	}
}