import java.util.Scanner;

public class ZigZagPattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int numRows = sc.nextInt();
		String ans = convert(str,numRows);
		System.out.print(ans);
	}
	private static String convert(String s, int numRows){
		if(numRows == 1 || numRows == s.length()) return s;
		StringBuilder[] sb = new StringBuilder[numRows];
		for(int i =0;i<sb.length;i++) sb[i] = new StringBuilder();
		int direction = -1, row =0;
		for(char ch : s.toCharArray()){
			if(!Character.isLetter(ch)) continue;
			if(row ==0)	direction = -1;
			if(row >= numRows-1) direction = 1;
			sb[row].append(ch);
			if(direction == -1) row++;
			else row--;
		}
		for(int i = 1;i<sb.length;i++){
			sb[0].append(sb[i]);
		}
		return sb[0].toString();
	}
}