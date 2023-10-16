import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static boolean[] prime;

	public static void main(String src[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		prime = new boolean[b + 1];
		get_prime();

		for (int i = a; i <= b; i++) {
			if (!prime[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	// 에라토스테네스의 체 알고리즘
	public static void get_prime() {
		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i]) continue;
			// i 의 배수들을 걸러주기 위한 반복문
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}