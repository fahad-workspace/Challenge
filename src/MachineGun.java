import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MachineGun {

	private static Scanner sc;
	private static int num, i, max;
	private static String result = "";
	private static List<Integer> list1, list2;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		num = sc.nextInt();
		list1 = new ArrayList<>();
		list2 = new ArrayList<>();
		for (i = 0; i < num; i++) {
			list1.add(sc.nextInt());
		}
		max = Collections.max(list1);
		for (i = 0; i < max; i++) {
			list2.add(i + 1);
		}
		for (i = 0; i < num; i++) {
			result = result + (list2.indexOf(list1.get(i)) + 1) + " ";
			list2.remove(list2.indexOf(list1.get(i)));
		}
		System.out.println(result);
	}
}