import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		TreeMap<String, Integer> treeMap = new TreeMap<>();

		for (int i = 0; i < N + M; i++) {
			String s = br.readLine();
			if (treeMap.containsKey(s)) {
				treeMap.put(s, treeMap.get(s) + 1);
			} else {
				treeMap.put(s, 1);
			}
		}

		int target = 2;
		int count = 0;

		for (Integer value : treeMap.values()) {
			if (value == target) {
				count++;
			}
		}

		sb.append(count).append("\n");

		for (String key : treeMap.keySet()) {
			if (treeMap.get(key) == target) {
				sb.append(key).append("\n");
			}
		}
		System.out.println(sb);
	}
}