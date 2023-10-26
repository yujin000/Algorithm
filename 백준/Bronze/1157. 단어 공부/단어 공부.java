import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		s = s.toUpperCase();
		int arr[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'A']++;
		}

		int max = -1;
		char c = '?';

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				c = (char) (i + 'A');
			} else if (arr[i] == max) {
				c = '?';
			}
		}
		System.out.println(c);
	}
}