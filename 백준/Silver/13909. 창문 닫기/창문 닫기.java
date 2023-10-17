import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i * i <= num; i++) {
			count++;
		}

		System.out.println(count);
	}
}