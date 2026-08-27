import java.util.Scanner;
public class Initial{
	public static void main(String[] args){
		var a=5;
		var b =4;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a+" b: "+b);
		System.out.println(a +"divided by " +b+ " gives quetiont: "+ a/b + " and remainder: "+ a%b);
		int c = 37;
		System.out.println("Celcius value: "+ c);
		// °F = °C * 9/5 + 32
		int f = c * 9/5 +32;
		System.out.println("Fahrenheit: " + f);
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input % 2 == 0) System.out.println(input + " is even.");
		else System.out.println(input +" is odd.");
		for(int i =0;i<11;i++) System.out.printf("%d  : %d \n", i, (i*i));
		
	}
}