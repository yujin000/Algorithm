import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			String[] arr = br.readLine().split(" ");
			if(arr[0].equals("push")) {
				stack.push(Integer.parseInt(arr[1]));
			}else if(arr[0].equals("pop")) {
				sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
			}else if(arr[0].equals("top")) {
				sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
			}else if(arr[0].equals("size")) {
				sb.append(stack.size()).append("\n");
			}else if(arr[0].equals("empty")) {
				sb.append(stack.isEmpty() ? 1 : 0).append("\n");
			}
		}
		System.out.println(sb);
	}
}