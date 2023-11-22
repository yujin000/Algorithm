import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] code1 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine());
		int[] code2 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine());
		int[] code3 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		
		int x;
		int y;
		
		if(code1[0]==code2[0]) {
			x=code3[0];
		}
		else if(code1[0]==code3[0]) {
			x=code2[0];
		}
		else {
			x=code1[0];
		}
		
		if(code1[1]==code2[1]) {
			y=code3[1];
		}
		else if(code1[1]==code3[1]) {
			y=code2[1];
		}
		else {
			y=code1[1];
		}
		
		System.out.println(x+" "+y);
	}
}