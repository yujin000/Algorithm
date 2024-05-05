import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int sum = 0;

		for (int i = 0; i < N; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		sum -= N - 1;
		System.out.println(sum);
	}
}