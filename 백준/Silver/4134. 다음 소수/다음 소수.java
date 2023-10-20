import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			long n = sc.nextLong();

			if (n <= 2) {
				System.out.println(2);
				continue;
			}

			while (true) {
				boolean prime = true;

				for (int j = 2; j <= Math.sqrt(n); j++) {
					if (n % j == 0) {
						prime = false;
						break;
					}
				}
				if (prime) {
					System.out.println(n);
					break;
				}
				n++;
			}
		}
		sc.close();
	}
}