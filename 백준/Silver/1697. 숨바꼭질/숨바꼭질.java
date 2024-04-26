import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	private static int[] arr = new int[100001];
	private static int[] dx = { -1, 1, 2 };
	private static int N;
	private static int K;

	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		if (N == K) {
			System.out.println(0);
		} else {
			bfs(N);
		}
	}

	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		arr[start] = 1;

		while (!queue.isEmpty()) {
			int x = queue.poll();

			for (int i = 0; i < 3; i++) {
				int nx;

				if (i == 2) {
					nx = x * 2;
				} else {
					nx = x + dx[i];
				}

				if (nx == K) {
					System.out.println(arr[x]);
					return;
				}

				if (nx >= 0 && nx < arr.length && arr[nx] == 0) {
					queue.add(nx);
					arr[nx] = arr[x] + 1;
				}
			}
		}
	}
}