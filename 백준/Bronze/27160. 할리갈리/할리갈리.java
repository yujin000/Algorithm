import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int num = Integer.parseInt(st.nextToken());

			if (hashMap.containsKey(s)) {
				hashMap.put(s, hashMap.get(s) + num);
			} else {
				hashMap.put(s, num);
			}
		}

		boolean tf = hashMap.containsValue(5);

		if (tf) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}