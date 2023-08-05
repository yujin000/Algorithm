import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		double arr[] = new double[num];

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = (int) arr[i];
			}
		}
		
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max * 100;
			avg=avg+arr[i];
		}
		avg=avg/arr.length;
		
		System.out.println(avg);
	}
}