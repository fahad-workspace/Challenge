import java.util.Scanner;

public class LittleDeepu {

	private static Scanner sc;
	private static int arraySize, i, numItr, j, num;
	private static int[] list;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		arraySize = sc.nextInt();
		list = new int[arraySize];
		for (i = 0; i < arraySize; i++) {
			list[i] = sc.nextInt();
		}
		numItr = sc.nextInt();
		for (i = 0; i < numItr; i++) {
			num = sc.nextInt();
			for (j = 0; j < list.length; j++) {
				if (list[j] > num)
					list[j] = list[j]-1;
			}
		}
		for (i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
}