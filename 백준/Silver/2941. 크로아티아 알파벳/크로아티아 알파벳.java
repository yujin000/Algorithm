import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count++;
			if (i < s.length() - 1) {
				if (s.charAt(i) == 'c' && s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
					i++;
				} else if (s.charAt(i) == 'd') {
					if (s.charAt(i + 1) == '-') {
						i++;
					} else if (i < s.length() - 2 && s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
						i += 2;
					}
				} else if ((s.charAt(i) == 'l' || s.charAt(i) == 'n') && s.charAt(i + 1) == 'j') {
					i++;
				} else if ((s.charAt(i) == 's' || s.charAt(i) == 'z') && s.charAt(i + 1) == '=') {
					i++;
				}
			}
		}
		br.close();
		System.out.println(count);
	}
}