import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		Stack<Integer> stack = new Stack<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String su = st.nextToken();
			if (su.equals("1")) {
				stack.push(Integer.parseInt(st.nextToken()));
			} else if (su.equals("2")) {
				sb.append(stack.empty() ? -1 : stack.pop()).append("\n");
			} else if (su.equals("3")) {
				sb.append(stack.size()).append("\n");
			} else if (su.equals("4")) {
				sb.append(stack.empty() ? 1 : 0).append("\n");
			} else if (su.equals("5")) {
				sb.append(stack.empty() ? -1 : stack.peek()).append("\n");
			}
		}
		br.close();
		System.out.println(sb);
	}
}