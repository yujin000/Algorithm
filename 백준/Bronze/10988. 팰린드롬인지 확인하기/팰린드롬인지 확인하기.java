import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		String sum = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			sum += s.charAt(i);
		}

		if (s.equals(sum)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}