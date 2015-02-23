import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ashu {

	private static Scanner sc;
	private static int[] myList;
	private static int loop, result;
	private static List<Integer> myResult;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int i, num, numOfQuery, query, x, y;
		num = sc.nextInt();
		myList = new int[num];
		myResult = new ArrayList<Integer>();
		for (i = 0; i < num; i++) {
			myList[i] = sc.nextInt();
		}
		numOfQuery = sc.nextInt();
		for (i = 0; i < numOfQuery; i++) {
			query = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			if (query == 0) {
				Ashu.modify(x - 1, y - 1);
			}
			if (query == 1) {
				Ashu.even(x - 1, y - 1);
			}
			if (query == 2) {
				Ashu.odd(x - 1, y - 1);
			}
		}
		for (i = 0; i < myResult.size(); i++) {
			System.out.println(myResult.get(i));
		}
	}

	private static void modify(int a, int b) {
		myList[a] = myList[b];
	}

	private static void even(int a, int b) {
		result = 0;
		for (loop = a; loop <= b; loop++) {
			if (myList[loop] % 2 == 0)
				result++;
		}
		myResult.add(result);
	}

	private static void odd(int a, int b) {
		result = 0;
		for (loop = a; loop <= b; loop++) {
			if (myList[loop] % 2 != 0)
				result++;
		}
		myResult.add(result);
	}
}