import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[1001];

		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(st.nextToken())]++;
		}

		int prev = 0;
		int sum = 0;

		for (int i = 0; i < 1001; i++) {
			while (arr[i]-- > 0) {
				sum += (i + prev);
				prev += i;
			}
		}
		System.out.println(sum);
	}
}