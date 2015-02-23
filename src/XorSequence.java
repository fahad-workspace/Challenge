import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XorSequence {

	private static Scanner sc;
	private static int numOfTestCases, i, j, k, listSize, numberOfQuries,
			count;
	private static List<Integer> inputList;
	private static List<Integer[]> combinationList;
	private static Integer[] arr;
	private static List<Integer> result = new ArrayList<>();

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		numOfTestCases = sc.nextInt();
		for (i = 0; i < numOfTestCases; i++) {
			inputList = new ArrayList<>();
			combinationList = new ArrayList<>();
			listSize = sc.nextInt();
			for (j = 0; j < listSize; j++)
				inputList.add(sc.nextInt());
			for (j = 0; j < listSize; j++) {
				for (k = j; k < listSize; k++) {
					arr = new Integer[2];
					arr[0] = inputList.get(j);
					arr[1] = inputList.get(k);
					combinationList.add(arr);
				}
			}
			numberOfQuries = sc.nextInt();
			for (j = 0; j < numberOfQuries; j++) {
				arr = new Integer[2];
				arr[0] = sc.nextInt();
				arr[1] = sc.nextInt();
				mainCalc(arr[0], arr[1]);
			}
		}
		for (i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
	}

	static void mainCalc(int a, int b) {
		count = 0;
		for (int loop1 = 0; loop1 < combinationList.size(); loop1++) {
			Integer[] arrTemp = combinationList.get(loop1);
			int xor = arrTemp[0];
			for (int loop2 = arrTemp[0] + 1; loop2 <= arrTemp[1]; loop2++) {
				xor = xor ^ inputList.get(loop2 - 1);
			}
			if (xor >= a && xor <= b)
				count++;
		}
		result.add(count);
	}
}
