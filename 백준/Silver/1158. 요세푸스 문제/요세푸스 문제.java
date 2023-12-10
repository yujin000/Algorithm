import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			list.add(i + 1);
		}
		
		int index = 0;
		sb.append('<');
		
		while (N > 1) {
			index = (index + (K - 1)) % N;
			sb.append(list.remove(index)).append(", ");
			N--;
		}

		sb.append(list.remove()).append('>');
		System.out.println(sb);
	}
}