import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int num = Integer.parseInt(br.readLine());
		boolean arr[][] = new boolean[100][100];
		int count =0;
		
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (!arr[j][k]) {
						arr[j][k]=true;
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}