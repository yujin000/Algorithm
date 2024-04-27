import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	private static int[][] arr;
	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };
	private static int N;
	private static int M;

	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N][M];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}

		System.out.println(bfs(0, 0));
	}

	private static int bfs(int startX, int startY) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { startX, startY });

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0];
			int y = current[1];
			
			//도착 지점에 도달한 경우 현재까지의 이동 횟수를 반환
			if (x == N - 1 && y == M - 1) {
				return arr[x][y];
			}
			
			//상하좌우로 이동하며 탐색
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				//미로를 벗어나거나 이동할 수 없는 칸인 경우 건너뜀
				if (nx < 0 || nx >= N || ny < 0 || ny >= M || arr[nx][ny] == 0) {
					continue;
				}
				
				//방문하지 않은 위치라면 큐에 추가하고 이전 위치의 이동 횟수 + 1을 기록
				if (arr[nx][ny] == 1) {
					queue.add(new int[] { nx, ny });
					arr[nx][ny] = arr[x][y] + 1;
				}
			}
		}
		//도착 지점에 도달할 수 없는 경우는 없다고 가정하였으므로 여기까지 도달하는 경우는 없음
		return -1;
	}
}