import java.util.Scanner;
public class SubtractTheProductAndSumOfDigitsOfAnIntegerMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		var obj = new SubtractTheProductAndSumOfDigitsOfAnInteger();
		int ans = obj.subtractProductAndSum(n);
		System.out.println(ans);
	}
}
class SubtractTheProductAndSumOfDigitsOfAnInteger{
	public int subtractProductAndSum(int n){
		int sum =0,product =1;
		while(n!=0){
			sum+= n%10;
			product*=n%10;
			n/=10;
		}
		return product - sum;
	}
}