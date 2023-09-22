import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;

		for (int i = 0; i < num; i++) {
			int s = Integer.parseInt(st.nextToken());
			boolean tf = true;

			if (s == 1) {
				continue;
			}
			for (int j = 2; j <= Math.sqrt(s); j++) {
				if (s % j == 0) {
					tf = false;
				}
			}
			if (tf) {
				count++;
			}
		}
		System.out.println(count);
	}
}