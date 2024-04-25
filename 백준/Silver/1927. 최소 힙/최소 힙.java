import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		PriorityQueue<Integer> pQ = new PriorityQueue<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				if (pQ.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(pQ.poll()).append("\n");
				}
			} else {
				pQ.offer(num);
			}
		}
		System.out.println(sb);
	}
}