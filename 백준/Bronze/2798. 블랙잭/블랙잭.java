import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int arr[] = new int[a];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int result = search(arr, a, b);
		System.out.println(result);
	}

	static int search(int[] arr, int a, int b) {
		int result = 0;

		for (int i = 0; i < a - 2; i++) {
			for (int j = i + 1; j < a - 1; j++) {
				for (int k = j + 1; k < a; k++) {
					int tmp = arr[i] + arr[j] + arr[k];
					if (result < tmp && tmp < b) {
						result = tmp;
					}

					if (tmp == b) {
						return tmp;
					}
				}
			}
		}
		return result;
	}
}