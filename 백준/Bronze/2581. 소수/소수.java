import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int count = 0;
		int min = -1;

		for (int i = a; i <= b; i++) {
			boolean tf = true;

			if (i == 1) {
				continue;
			}

			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					tf = false;
				}
			}
			if (tf) {
				count += i;
				if (min == -1 || i < min) {
					min = i;
				}
			}
		}
		if(count==0) {
			System.out.println(-1);
		}
		else{
			System.out.println(count);
			System.out.println(min);
		}
	}
}