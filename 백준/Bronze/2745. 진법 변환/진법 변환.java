import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());

		int count = 0;
		int sum = 0;
		int num = 0;

		for (int i = N.length() - 1; i >= 0; i--) {
			char c = N.charAt(i);
			if (c >= '0' && c <= '9') {
				num = c - '0';
			} else {
				num = c - 'A' + 10;
			}
			sum += (int) num * Math.pow(B, count++);
		}
		System.out.println(sum);
	}
}