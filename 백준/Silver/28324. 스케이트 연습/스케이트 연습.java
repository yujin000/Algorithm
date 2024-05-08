import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		long sum = 1;
		int pre = 1;
		
		for (int i = N - 2; i >= 0; i--) {
			if (pre < arr[i]) {
				pre++;
			} else if (pre > arr[i]) {
				pre = arr[i];
			}
			sum += pre;
		}
		
		System.out.println(sum);
	}
}