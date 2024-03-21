import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(br.readLine());
		int A = 64;
		int count = 0;

		while (X > 0) {
			if (A > X) {
				A /= 2;
			} else {
				X -= A;
				count++;
			}
		}
		System.out.println(count);
	}
}