import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		Deque<Character> deque = new ArrayDeque<>();
		
		while(T-->0) {
			String s = br.readLine();
			String[] arr = s.split(" ");
			for(int i=0; i<arr.length;i++) {
				for(char c : arr[i].toCharArray()) {
					deque.add(c);
				}
				while(!deque.isEmpty()) {
					sb.append(deque.pollLast());
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}