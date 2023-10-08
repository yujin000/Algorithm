import java.util.Scanner;

public class Main {
	public static void main(String src[]) {
		Scanner sc = new Scanner(System.in);

		String num = sc.nextLine();
		int arr[] = new int[num.length()];

		for (int i = 0; i < num.length(); i++) {
			arr[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
		}

		for (int i = 0; i < num.length(); i++) {
			for (int j = 0; j < num.length(); j++) {
				if (arr[i] > arr[j]) {
					int tmp = 0;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		for (int i = 0; i < num.length(); i++) {
			System.out.print(arr[i]);
		}
	}
}