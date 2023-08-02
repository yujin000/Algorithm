import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st1.nextToken());
		int b = Integer.parseInt(st1.nextToken());
		
		int arr[]=new int[a];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i=0;i<a;i++) {
			arr[i]=Integer.parseInt(st2.nextToken());
		}
		
		for(int i=0;i<a;i++) {
			if(arr[i]<b) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
