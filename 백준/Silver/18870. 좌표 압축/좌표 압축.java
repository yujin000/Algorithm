import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int[] sortArr = arr.clone();
		Arrays.sort(sortArr);

		HashMap<Integer, Integer> hashMap = new HashMap<>();

		int num = 0;
		for (int i : sortArr) {
			if (!hashMap.containsKey(i)) {
				hashMap.put(i, num);
				num++;
			}
		}

		for (int i : arr) {
			int value = hashMap.get(i);
			sb.append(value).append(' ');
		}

		System.out.println(sb);
	}
}