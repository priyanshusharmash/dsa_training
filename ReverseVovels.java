import java.util.Scanner;
public class ReverseVovels{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = reverseVovels(s);
		System.out.print(ans);
	}
	private static String reverseVovels(String s){
		char[] arr = s.toCharArray();
		int first =0,last = s.length()-1;
		while(first<last){
        while(first<last && !isVovel(arr[first])) first++;
        while(last>first && !isVovel(arr[last])) last--;
        char temp = arr[first];
        arr[first++] = arr[last];
        arr[last--] = temp;
      }
      return new String(arr);
	}
	private static boolean isVovel(char ch){
		ch = Character.toLowerCase(ch);
		if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u') return true;
		return false;
	}
	
}