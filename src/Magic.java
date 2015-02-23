import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magic {

	private static Scanner sc;
	static List<Integer> result = new ArrayList<Integer>();

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int numOfCases = sc.nextInt();
		int i, input, count;
		for (i = 0; i < numOfCases; i++) {
			input = sc.nextInt();
			count = 0;
			while (input > 0) {
				if (input % 2 != 0)
					count++;
				input = input / 2;
			}
			result.add(count);
		}
		for (i = 0; i < numOfCases; i++)
			System.out.println(result.get(i));
	}
}