import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (;;) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());

			if (s.equals("#") && a == 0 && w == 0)
				break;

			String r = (a > 17 || w >= 80) ? "Senior" : "Junior";
			
			System.out.println(s + " " + r);
		}
	}
}