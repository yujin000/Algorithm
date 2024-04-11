import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String src[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			if(isvalid(s)) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		System.out.println(sb);
	}
	
	private static boolean isvalid(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c=='(') {
				stack.push(')');
			}else if(!stack.isEmpty()&&stack.peek()==c) {
				stack.pop();
			}else {
				return false;
			}
		}
		return stack.empty();
	}
}