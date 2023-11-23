import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (;;) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			if ((a + b > c) && (a + c > b) && (b + c > a) && a > 0 && b > 0 && c > 0) {
				String s = (a == b && b == c && a == c) ? "Equilateral"
						: (a == b || b == c || a == c) ? "Isosceles" : "Scalene";
				System.out.println(s);
			} else
				System.out.println("Invalid");
		}
	}
}