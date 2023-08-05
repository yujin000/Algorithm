import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt()%42;
		}
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			int eql=0;
			for(int j=i+1;j<10;j++) {
				if(arr[i]==arr[j]) {
					eql++;
				}
			}
			if(eql==0)count++;
		}
		System.out.println(count);
	}
}