import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String src[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();

		System.out.println(a.divide(b));
		System.out.println(a.remainder(b));
	}
}