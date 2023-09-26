import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String arr[][] = new String[5][];
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			String s = br.readLine();
			arr[i] = new String[s.length()];

			for (int j = 0; j < s.length(); j++) {
				arr[i][j] = String.valueOf(s.charAt(j));
			}
			if (s.length() > max) {
				max = s.length();
			}
		}

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i < arr[j].length && arr[j][i] != null) {
					System.out.print(arr[j][i]);
					;
				}
			}
		}
	}
}