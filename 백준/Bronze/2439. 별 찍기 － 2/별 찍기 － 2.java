import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int su = Integer.parseInt(bf.readLine());

		for (int i = 1; i <= su; i++) {
			for (int j = su - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int e = 1; e <= i; e++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
