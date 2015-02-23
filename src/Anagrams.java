import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	private static Scanner sc;
	private static int num, i;
	private static String str1, str2;
	private static String[] result;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		num = sc.nextInt();
		result = new String[num];
		for (i = 0; i < num; i++) {
			str1 = sc.next();
			str2 = sc.next();
			if (str1.length() != str2.length()) {
				result[i] = "NO";
				continue;
			}
			char[] str1Arr = str1.toCharArray();
			char[] str2Arr = str2.toCharArray();
			Arrays.sort(str1Arr);
			Arrays.sort(str2Arr);
			if (Arrays.equals(str1Arr, str2Arr)) {
				result[i] = "YES";
				continue;
			}
			result[i] = "NO";
		}
		for (i = 0; i < num; i++) {
			System.out.println(result[i]);
		}
	}
}