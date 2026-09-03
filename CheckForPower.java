import java.util.Scanner;
public class CheckForPower{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean ans = checkForPower(x,y);
		System.out.println(ans);
	}
	//y == x^n??
	private static boolean checkForPower(int x,int y){
		for(int i =1;i<=30;i++){
			if(Math.pow(x,i) == y) return true;
		}
		return false;
	}
}