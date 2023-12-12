import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> list = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			list.add(i);
		}

		while (list.size() >= 2) {
			list.remove();
			list.add(list.remove());
		}
		System.out.println(list.get(0));
	}
}