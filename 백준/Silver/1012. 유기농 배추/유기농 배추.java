import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };
	private static int[][] arr;
	private static boolean[][] visit;

	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			arr = new int[M][N];
			visit = new boolean[M][N];

			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[x][y] = 1;
			}

			int count = 0;

			for (int a = 0; a < M; a++) {
				for (int b = 0; b < N; b++) {
					if (arr[a][b] == 1 && !visit[a][b]) {
						count++;
						dfs(a, b, arr, visit, M, N);
					}
				}
			}
			System.out.println(count);
		}
	}

	private static void dfs(int x, int y, int[][] arr, boolean[][] visit, int M, int N) {
		visit[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
				if (arr[x][y] == 1 && !visit[nx][ny]) {
					dfs(nx, ny, arr, visit, M, N);
				}
			}
		}
	}
}