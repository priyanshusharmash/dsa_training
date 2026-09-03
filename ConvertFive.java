import java.util.Scanner;
public class ConvertFive{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = convertFive(n);
		System.out.println(ans);
	}
	private static int convertFive(int n){
		if(n==0) return 5;
		int num =0,place=1;
		while(n!= 0){
			int digit = n%10;
			if(digit==0) digit =5;
			num = num + digit*place;
			place*=10;
			n/=10;
		}
		return num;
	}
}