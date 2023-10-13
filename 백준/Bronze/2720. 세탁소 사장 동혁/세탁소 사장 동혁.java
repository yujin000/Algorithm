import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			int s = Integer.parseInt(br.readLine());
			int q = 0;
			int d = 0;
			int n = 0;
			int p = 0;
			
			if(s>=25) {
				q = s/25;
				s-=25*q;
			}
			if(s>=10) {
				d = s/10;
				s-=10*d;
			}
			if(s>=5) {
				n = s/5;
				s-=5*n;
			}
			if(s>=1) {
				p = s/1;
				s-=p;
			}
			sb.append(q+" "+d+" "+n+" "+p+" ").append("\n");
		}
		System.out.println(sb);
	}
}