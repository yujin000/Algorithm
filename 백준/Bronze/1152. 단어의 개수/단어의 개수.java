import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		s = s.trim();
		if(s.isEmpty()==true) {
			System.out.println(0);
		}
		else{
			String[] arr = s.split(" ");
			System.out.println(arr.length);
		}
	}
}