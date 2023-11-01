import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (;;) {
			String s = br.readLine();
			if (s.equals("#")) {
				break;
			}
			int count = 0;

			s = s.toLowerCase();

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}