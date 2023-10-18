import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		int Usum = a * d + c * b;
		int Dsum = b * d;

		int min = gcd(Usum, Dsum);

		Usum /= min;
		Dsum /= min;

		System.out.println(Usum + " " + Dsum);
	}

	public static int gcd(int A, int B) {
		if (B == 0) {
			return A;
		}
		return gcd(B, A % B);
	}
}