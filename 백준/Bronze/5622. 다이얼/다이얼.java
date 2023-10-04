import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int count = 2;
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			if (s == 'A' || s == 'B' || s == 'C') {
				sum += count + 1;
			} else if (s == 'D' || s == 'E' || s == 'F') {
				sum += count + 2;
			} else if (s == 'G' || s == 'H' || s == 'I') {
				sum += count + 3;
			} else if (s == 'J' || s == 'K' || s == 'L') {
				sum += count + 4;
			} else if (s == 'M' || s == 'N' || s == 'O') {
				sum += count + 5;
			} else if (s == 'P' || s == 'Q' || s == 'R' || s == 'S') {
				sum += count + 6;
			} else if (s == 'T' || s == 'U' || s == 'V') {
				sum += count + 7;
			} else if (s == 'W' || s == 'X' || s == 'Y' || s == 'Z') {
				sum += count + 8;
			}
		}	
		System.out.println(sum);
	}
}