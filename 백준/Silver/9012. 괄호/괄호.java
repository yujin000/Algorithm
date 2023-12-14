import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String s = br.readLine();

			if (isValid(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
            }
		}
	}

	private static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(')');
			} else if (!stack.empty() && stack.peek() == c) {
				stack.pop();
			} else {
				return false;
			}
		}
		return stack.empty();
	}
}