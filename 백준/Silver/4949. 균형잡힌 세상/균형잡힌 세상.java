import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String s = br.readLine();
			if (s.equals(".")) {
				break;
			}
			sb.append(truefalse(s)).append("\n");
		}

		System.out.println(sb);
	}

	public static String truefalse(String s) {
		Stack<Character> stack = new Stack();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.empty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			} else if (c == ']') {
				if (stack.empty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}

		if (stack.empty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}