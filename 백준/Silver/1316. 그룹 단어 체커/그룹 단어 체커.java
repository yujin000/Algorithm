import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String src[]) throws Exception {

		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean check() throws Exception {
		boolean[] check = new boolean[26];
		String s = br.readLine();
		int pre = 0;

		for (int i = 0; i < s.length(); i++) {
			int now = s.charAt(i);

			if (pre != now) {
				if (!check[now - 'a']) {
					check[now - 'a'] = true;
					pre = now;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}