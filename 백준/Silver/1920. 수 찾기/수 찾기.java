import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static int[] arr;

	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(lowerBound(num)>=0 ? 1 : 0).append("\n");
		}
		System.out.println(sb);
	}

	private static int lowerBound(int num) {
		int min = 0;
		int max = arr.length - 1;

		while (min <= max) {
			int mid = (min + max) / 2;
			if (num < arr[mid]) {
				max = mid - 1;
			} else if (num > arr[mid]) {
				min = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}