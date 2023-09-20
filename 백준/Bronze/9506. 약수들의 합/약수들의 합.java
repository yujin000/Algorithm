import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			int a = Integer.parseInt(br.readLine());
			if (a == -1)
				break;

			int arr[] = new int[a];
			int count = 0;
			int sum = 0;

			for (int i = 1; i < a; i++) {
				if (a % i == 0) {
					arr[count++] = i;
					sum += i;
				}
			}

			if (sum != a) {
				sb.append(a + " is NOT perfect.").append("\n");
			}

			else {
				sb.append(a + " = ");

				for (int i = 0; i < count; i++) {
					sb.append(arr[i]);
					if (i + 1 != count) {
						sb.append(" + ");
					}
				}
				sb.append("\n");
			}
		}
		br.close();
		System.out.println(sb);
	}
}