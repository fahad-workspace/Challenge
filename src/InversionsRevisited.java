import java.util.Scanner;

public class InversionsRevisited {

	private static Scanner sc;
	private static int length, i, j, count;
	private static int[] arr1, arr2;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		length = sc.nextInt();
		arr1 = new int[length];
		arr2 = new int[length];
		for (i = 0; i < length; i++) {
			arr1[i] = sc.nextInt();
		}
		sc.nextInt();
		for (i = 1; i < length; i++) {
			arr2[i] = sc.nextInt();
			for(j=0; j<i; j++) {
				if (arr1[j] > arr2[i])
					count++;
			}
		}
		System.out.println(count);
	}
}
