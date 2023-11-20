import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double sum = 0;
		int count = 0;

		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String g = st.nextToken();

			if (!g.equals("P")) {
				double grad = 0;
				if (g.equals("A+"))
					grad = 4.5;
				else if (g.equals("A0"))
					grad = 4.0;
				else if (g.equals("B+"))
					grad = 3.5;
				else if (g.equals("B0"))
					grad = 3.0;
				else if (g.equals("C+"))
					grad = 2.5;
				else if (g.equals("C0"))
					grad = 2.0;
				else if (g.equals("D+"))
					grad = 1.5;
				else if (g.equals("D0"))
					grad = 1.0;
				else
					grad = 0.0;

				sum += (score * grad);
				count += score;
			} 
		}
		System.out.printf("%.6f",sum / count);
	}
}