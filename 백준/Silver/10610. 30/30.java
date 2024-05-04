import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String N = br.readLine();

		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < N.length(); i++) {
			list.add(N.charAt(i));
		}

		if (list.contains('0')) {
			int sum = 0;
			for (char c : list) {
				sum += (c - '0');
			}
			if (sum % 3 == 0) {
				Collections.sort(list, Collections.reverseOrder());
				for (char c : list) {
					sb.append(c);
				}
				System.out.println(sb);
			} else {
				System.out.println(-1);
			}
		} else {
			System.out.println(-1);
		}
	}
}