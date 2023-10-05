import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 2; i <= Math.sqrt(num); i++) {
			while (num % i == 0) {
				num = num / i;
				System.out.println(i);
			}
		}
		if (num != 1) {
			System.out.println(num);
		}
	}
}