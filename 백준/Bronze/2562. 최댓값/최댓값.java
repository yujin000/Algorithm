import java.util.Scanner;

public class Main {
	public static void main(String src[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [9];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int count=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==max) {
				count=i;
			}
		}
		
		System.out.println(max);
		System.out.println(count+1);
	}
}