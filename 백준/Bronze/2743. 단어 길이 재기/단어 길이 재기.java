import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		System.out.println(s.length());
	}
}