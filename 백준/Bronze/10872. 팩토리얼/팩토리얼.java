import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 1;

		for (int i = num; i >= 1; i--) {
			sum *= i;
		}
		System.out.println(sum);
	}
}