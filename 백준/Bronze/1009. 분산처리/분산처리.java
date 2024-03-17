import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a % 10 == 0) {
				sb.append(10 + "\n");
				continue;
			}
			int num = a % 10;
			for (int j = 1; j < b; j++) {
				num = (num * a) % 10;
			}
			sb.append(num + "\n");
		}
		System.out.println(sb);
	}
}