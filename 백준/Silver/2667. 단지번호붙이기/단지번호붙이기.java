import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	private static int[][] arr;
	private static boolean[][] visit;
	private static int[] dx = { 1, -1, 0, 0 };
	private static int[] dy = { 0, 0, 1, -1 };
	private static int n;
	private static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visit = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1 && !visit[i][j]) {
					list.add(dfs(i, j));
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for(int num : list) {
			System.out.println(num);
		}
	}

	private static int dfs(int x, int y) {
		visit[x][y] = true;
		int count = 1;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
				if (arr[nx][ny] == 1 && !visit[nx][ny]) {
					count += dfs(nx, ny);
				}
			}
		}
		return count;
	}
}