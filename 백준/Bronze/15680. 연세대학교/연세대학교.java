import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N==0) {
			System.out.println("YONSEI");
		}else if(N==1) {
			System.out.println("Leading the Way to the Future");
		}
	}
}