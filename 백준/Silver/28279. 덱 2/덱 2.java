import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());

		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (s.equals("1")) {
				stack.addFirst(Integer.parseInt(st.nextToken()));
			} else if (s.equals("2")) {
				stack.addLast(Integer.parseInt(st.nextToken()));
			} else if (s.equals("3")) {
				sb.append(stack.isEmpty() ? -1 : stack.peekFirst()).append("\n");
				if (!stack.isEmpty()) {
					stack.removeFirst();
				}
			} else if (s.equals("4")) {
				sb.append(stack.isEmpty() ? -1 : stack.peekLast()).append("\n");
				if (!stack.isEmpty()) {
					stack.removeLast();
				}
			} else if (s.equals("5")) {
				sb.append(stack.size()).append("\n");
			} else if (s.equals("6")) {
				sb.append(stack.isEmpty() ? 1 : 0).append("\n");
			} else if (s.equals("7")) {
				sb.append(stack.isEmpty() ? -1 : stack.peekFirst()).append("\n");
			} else if (s.equals("8")) {
				sb.append(stack.isEmpty() ? -1 : stack.peekLast()).append("\n");
			}
		}
		br.close();
		System.out.println(sb);
	}
}