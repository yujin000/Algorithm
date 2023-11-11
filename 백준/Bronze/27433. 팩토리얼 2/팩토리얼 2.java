import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(fn(n));
	}

	public static long fn(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fn(n-1);
		}
	}
}