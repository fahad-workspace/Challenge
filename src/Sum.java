import java.util.Scanner;

public class Sum {

	private static Scanner sc;
	private static int num, i;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] result = new int[n];
		for (i = 0; i < (n * 2); i++) {
			if (i % 2 == 0)
				num = sc.nextInt();
			else
				result[i / 2] = num + sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			System.out.println(result[i]);
		}
	}
}
