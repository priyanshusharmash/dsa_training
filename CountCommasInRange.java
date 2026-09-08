import java.util.Scanner;
public class CountCommasInRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = countCommas(n);
		System.out.print(ans);
	}
	private static int countCommas(int n){
		if(n<1000) return 0;
		return (n-1000)+1;
	}
}