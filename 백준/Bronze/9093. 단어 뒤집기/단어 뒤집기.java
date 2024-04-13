import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);

			while (st.hasMoreTokens()) {
				String ss = st.nextToken();
				StringBuilder splitSb = new StringBuilder();
				for (int i = ss.length() - 1; i >= 0; i--) {
					splitSb.append(ss.charAt(i));
				}
				sb.append(splitSb).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}