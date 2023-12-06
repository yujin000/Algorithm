import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		System.out.println(fac(N, K));
	}

	public static int fac(int N, int K) {
		if (N == K || K == 0) {
			return 1;
		}
		return fac(N - 1, K) + fac(N - 1, K - 1);
	}
}