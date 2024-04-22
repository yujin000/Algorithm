import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	private static int[][] list;
	private static boolean[] visit;
	private static StringBuilder sb = new StringBuilder();
	private static int N, M, V;
	private static Queue<Integer> queue = new LinkedList<>();

	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		list = new int[N + 1][N + 1];
		visit = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			list[a][b] = list[b][a] = 1;
		}

		dfs(V);
		sb.append("\n");
		visit = new boolean[N + 1];
		bfs(V);
		System.out.println(sb);
	}

	private static void dfs(int num) {
		visit[num] = true;
		sb.append(num + " ");
		for (int i = 0; i <= N; i++) {
			if (list[num][i] == 1 && !visit[i])
				dfs(i);
		}
	}

	private static void bfs(int num) {
		queue.add(num);
		visit[num] = true;

		while (!queue.isEmpty()) {
			num = queue.poll();
			sb.append(num + " ");

			for (int i = 1; i <= N; i++) {
				if (list[num][i] == 1 && !visit[i]) {
					queue.add(i);
					visit[i] = true;
				}
			}
		}
	}
}