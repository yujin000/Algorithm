import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = a / 4;
		String s = "long ";
		for(int i=1;i<=b;i++) {
			System.out.print(s);
		}
		System.out.print("int");
	}
}
