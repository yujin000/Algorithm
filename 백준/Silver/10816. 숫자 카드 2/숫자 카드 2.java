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
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int target = Integer.parseInt(st.nextToken());
			hashMap.put(target, hashMap.getOrDefault(target, 0) + 1);
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			int target = Integer.parseInt(st.nextToken());
			if (hashMap.containsKey(target)) {
				sb.append(hashMap.get(target)).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb);
	}
}