import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String arr[] = new String[2];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = st.nextToken();
			String s = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				s += arr[i].charAt(j);
			}
			arr[i] = s;
		}

		if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) {
			System.out.println(arr[0]);
		} else {
			System.out.println(arr[1]);
		}
	}
}