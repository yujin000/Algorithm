import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [31];
		
		for(int i=1; i<29;i++) {
			int num =sc.nextInt();
			arr[num]=1;
		}
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i]!=1) {
				System.out.println(i);
			}
		}
		
	}
}