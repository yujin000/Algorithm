import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		TreeMap<String, String> treeMap = new TreeMap<>(Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			treeMap.put(st.nextToken(), st.nextToken());
		}

		for (String s : treeMap.keySet()) {
			if ("enter".equals(treeMap.get(s))) {
				System.out.println(s);
			}
		}
	}
}