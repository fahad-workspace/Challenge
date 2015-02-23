import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FizzBuzz {

	private static Scanner sc;
	private static int num, i, j;
	private static String[] temp;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		Map<Integer, String[]> output = new HashMap<>();
		int n = sc.nextInt();
		for (i = 0; i < n; i++) {
			num = sc.nextInt();
			temp = new String[num];
			for (j = 1; j <= num; j++) {
				if (j % 3 == 0 || j % 5 == 0) {
					temp[j - 1] = "";
					if (j % 3 == 0)
						temp[j - 1] = "Fizz";
					if (j % 5 == 0) {
						temp[j - 1] = temp[j - 1] + "Buzz";
					}
					continue;
				}
				temp[j - 1] = String.valueOf(j);
			}
			output.put(i, temp);
		}
		for (int name : output.keySet()) {
			int key = name;
			String[] arr = output.get(name);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(key + " " + arr[i]);
			}
		}
	}
}