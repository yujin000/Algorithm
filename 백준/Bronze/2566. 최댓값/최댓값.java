import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int arr[][] = new int[9][9];
		
		for(int i=0;i<arr.length;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = -1 ;
		int a =0;
		int b=0;
		
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr.length; j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
					a=i+1;
					b=j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(a+" "+b);
	}
}