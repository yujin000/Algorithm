import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();

		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		while (N > 0) {
			if (N % B < 10) {
				sb.append(N % B);
			} else {
				sb.append((char) ((N % B) + 'A' - 10));
			}
			N /= B;
		}
		System.out.println(sb.reverse());
	}
}