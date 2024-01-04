import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		HashMap<Integer, Boolean> hashMap = new HashMap<>();

		for (int i = 0; i < N; i++) {
			hashMap.put(Integer.parseInt(st.nextToken()), true);
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			if (hashMap.containsKey(Integer.parseInt(st.nextToken()))) {
				sb.append(1).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}

		System.out.println(sb);
	}
}