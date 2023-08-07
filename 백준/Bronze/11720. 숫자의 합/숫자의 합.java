import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		int sum=0;
		
		for (int i = 0; i < num; i++) {
			sum+=s.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}