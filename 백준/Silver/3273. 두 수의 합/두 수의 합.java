import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int x = Integer.parseInt(br.readLine());

		Arrays.sort(arr);

		int l = 0, r = arr.length - 1;
		int count = 0;

		while (l < r) {
			if (arr[l] + arr[r] > x) {
				r -= 1;
			} else if (arr[l] + arr[r] < x) {
				l += 1;
			} else {
				count++;
				r -= 1;
				l += 1;
			}
		}
		System.out.println(count);
	}
}