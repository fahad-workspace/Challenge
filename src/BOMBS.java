import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BOMBS {

	private static Scanner sc;
	private static int x, y, r, loop1, loop2, i, count;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> points = new ArrayList<>();
		Integer[] arr = new Integer[2];
		for (i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			r = sc.nextInt();
			for (loop1 = -r; loop1 <= r; ++loop1) {
				for (loop2 = -r; loop2 <= r; ++loop2) {
					if (loop1 * loop1 + loop2 * loop2 <= r * r) {
						arr[0] = loop1 + x;
						arr[1] = loop2 + y;
						if (arr[0] < 1 || arr[1] < 1)
							continue;
						if (arr[0] > 1000 || arr[1] > 1000)
							continue;
						points.add(String.valueOf(arr[0]) + "-"
								+ String.valueOf(arr[1]));
					}
				}
			}
		}
		Set<String> set = new HashSet<String>(points);
		for (String str : set) {
			if (Collections.frequency(points, str) > 1)
				count++;
		}
		System.out.println(count);
	}
}