import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String src[]) throws IOException {
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		while (T-->0) {
			LinkedList<int[]> queue = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < N; i++) {
				queue.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
			}

			int count = 0;

			while (!queue.isEmpty()) {
				int[] front = queue.poll();
				boolean isMax = true;
				for (int i = 0; i < queue.size(); i++) {
					if (front[1] < queue.get(i)[1]) {
						queue.offer(front);
						for (int j = 0; j < i; j++) {
							queue.offer(queue.poll());
						}
						isMax = false;
						break;
					}
				}
				if (isMax == false) {
					continue;
				}
				count++;
				if (front[0] == M) {
					break;
				}
			}
			sb.append(count).append('\n');
		}
		System.out.println(sb);
	}
}