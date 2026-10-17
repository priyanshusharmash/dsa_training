import java.util.Scanner;
import java.util.Arrays;

public class SortIntegersByTheNumberOfOneBits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) arr[i] = sc.nextInt();
		arr = sortByBits(arr);
		System.out.print(Arrays.toString(arr));
	}
	private static int[] sortByBits(int[] arr) {
		String binaryString;
		for(int i =0;i<arr.length;i++){
			for(int j =i+1;j<arr.length;j++){
				if(Integer.bitCount(arr[i])>Integer.bitCount(arr[j])){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}else if(Integer.bitCount(arr[i])==Integer.bitCount(arr[j])){
					if(arr[i]>arr[j]){
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		return arr;
	}
}