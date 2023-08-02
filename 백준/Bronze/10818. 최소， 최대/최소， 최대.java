import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st1.nextToken());

		int arr[] = new int[n];

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			else if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.print(min + " "+max);
	}
}