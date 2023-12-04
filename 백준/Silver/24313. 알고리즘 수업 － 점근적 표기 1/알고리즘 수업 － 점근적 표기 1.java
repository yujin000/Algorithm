import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		if (a1 * n + a2 <= c * n && a1 <= c) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}