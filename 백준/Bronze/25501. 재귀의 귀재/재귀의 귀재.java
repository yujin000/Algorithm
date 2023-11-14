import java.util.Scanner;

public class Main {
	static int count = 0;

	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			count = 0;
			String s = sc.next();
			System.out.println(isPalindrome(s) + " " + count);
		}
	}

	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}

	public static int recursion(String s, int l, int r) {
		count++;
		if (l >= r)
			return 1;
		else if (s.charAt(l) != s.charAt(r))
			return 0;
		else
			return recursion(s, l + 1, r - 1);
	}
}