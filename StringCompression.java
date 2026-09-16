import java.util.Scanner;
import java.util.Arrays;

public class StringCompression{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] chars = new char[n];
		for(int i =0;i<n;i++){
			chars[i] = sc.next().charAt(0);
		}
		int ans = compress(chars);
		System.out.println(Arrays.toString(chars));
		System.out.print(ans);
	}
	private static int compress(char[] chars){
		int current =0, last = 0;
		while(current<chars.length){
			char currentChar = chars[current];
			int count = 0;
			while(current<chars.length && chars[current] == currentChar) {
				count ++;
				current++;
			}
			
			chars[last++] = currentChar;
			
			if(count>1){

				char[] countChar = String.valueOf(count).toCharArray();
				
				for(char ch : countChar) chars[last++] = ch;
				
			}
			
		}
		return last;
	}

}