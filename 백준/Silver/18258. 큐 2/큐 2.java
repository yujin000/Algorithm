import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (s.equals("push")) {
				queue.add(Integer.parseInt(st.nextToken()));
			} else if (s.equals("pop")) {
				Integer value = queue.poll();
			    sb.append(value != null ? value : -1).append("\n");
			} else if (s.equals("size")) {
				sb.append(queue.size()).append("\n");
			} else if (s.equals("empty")) {
				sb.append(queue.isEmpty() ? 1 : 0).append("\n");
			} else if (s.equals("front")) {
				sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
			} else if (s.equals("back")) {
				sb.append(queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).getLast()).append("\n");
			}
		}
		br.close();
		System.out.println(sb);
	}
}