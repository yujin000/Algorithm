import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int arr1[][] = new int[a][b];
		
		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < b; j++) {
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int arr2[][] = new int[a][b];

		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < b; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				sb.append(arr1[i][j]+arr2[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}