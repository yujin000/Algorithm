import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int mx = w - x > x - 0 ? x - 0 : w - x;
		int my = h - y > y - 0 ? y - 0 : h - y;
		
		if (mx > my) {
			System.out.println(my);
		} else {
			System.out.println(mx);
		}
	}
}