import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String arr[]=new String[num];
		
		for(int i=0;i<arr.length;i++) {
			String s = br.readLine();
			arr[i]= s.substring(0,1)+s.substring(s.length()-1,s.length());
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}