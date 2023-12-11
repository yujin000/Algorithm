import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> list = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			list.add(i);
		}

		while (list.size() >= 2) {
			sb.append(list.remove()).append(" ");
			list.add(list.remove());
		}
		
		sb.append(list.remove());
		
		System.out.println(sb);
	}
}