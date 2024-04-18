import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(hashMap.getOrDefault(num, 0)).append(" ");
		}
		System.out.println(sb);
	}
}