import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	private static ArrayList<Integer>[] list;
	private static boolean[] visit;

	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		list = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x].add(y);
			list[y].add(x);
		}

		visit = new boolean[N + 1];
		int count = 0;
		for (int i = 1; i <=N; i++) {
			if (!visit[i]) {
				dfs(i);
				count++;
			}
		}

		System.out.println(count);
	}

	private static void dfs(int num) {
		visit[num] = true;
		for (int i : list[num]) {
			if (!visit[i]) {
				dfs(i);
			}
		}
	}
}