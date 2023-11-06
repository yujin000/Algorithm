import java.util.Scanner;

public class Main {
	public static void main(String src[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int N = sc.nextInt();
			sum += N > 40 ? N : 40;
		}
		System.out.println(sum / 5);
	}
}