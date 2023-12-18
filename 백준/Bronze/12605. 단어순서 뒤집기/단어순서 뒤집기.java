import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		Stack<String> list = new Stack<>();

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			String[] arr = s.split(" ");
			for (String L : arr) {
				list.push(L);
			}
			sb.append("Case #" + (i + 1) + ": ");
			for (int j = 0; j < arr.length; j++) {
				sb.append(list.pop()).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}