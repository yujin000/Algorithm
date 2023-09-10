import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<>();
		
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			int su =sc.nextInt();
			if(su==0) {
				stack.pop();
			}
			else {
				stack.push(su);
			}
		}
		
		int sum=0;
		
		for(int i : stack) {
			sum+=i;
		}
		
		System.out.println(sum);
	}
}