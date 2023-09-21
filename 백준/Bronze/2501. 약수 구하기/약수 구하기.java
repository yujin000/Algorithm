import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int count = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
				if (b == count) {
					System.out.println(i);
					return;
				}
			}
		}
		if(b>count) {
			System.out.println(0);
		}
	}
}