import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Oliver {

	private static Scanner sc;
	private static int largest, i, j, row, col, loop, num;
	private static Map<Integer, List<Integer[]>> map;
	private static Integer count;
	private static List<Integer[]> list1, list2;
	private static int[][] arr;
	private static Integer[] intarr;
	private static List<String> result;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		result = new ArrayList<>();
		num = sc.nextInt();
		for (; loop < num; loop++) {
			row = sc.nextInt();
			col = sc.nextInt();
			arr = new int[row][col];
			list1 = new ArrayList<>();
			for (i = 0; i < row; i++) {
				for (j = 0; j < col; j++) {
					arr[i][j] = sc.nextInt();
					if (arr[i][j] == 1) {
						intarr = new Integer[2];
						intarr[0] = i;
						intarr[1] = j;
						list1.add(intarr);
					}
				}
			}
			list2 = new ArrayList<>();
			map = new HashMap<>();
			count = 0;
			while (list1.size() != 0) {
				list2.add(list1.get(0));
				list1.remove(0);
				for (i = 0; i < list2.size(); i++) {
					for (j = 0; j < list1.size(); j++) {
						if (list2.get(i)[0] - list1.get(j)[0] > -2
								&& list2.get(i)[0] - list1.get(j)[0] < 2) {
							if (list2.get(i)[1] - list1.get(j)[1] > -2
									&& list2.get(i)[1] - list1.get(j)[1] < 2) {
								list2.add(list1.get(j));
								list1.remove(j);
								j--;
							}
						}
					}
				}
				count++;
				map.put(count, list2);
				list2 = new ArrayList<>();
			}
			largest=0;
			for (Iterator<Entry<Integer, List<Integer[]>>> iterator = map
					.entrySet().iterator(); iterator.hasNext();) {
				Entry<Integer, List<Integer[]>> entry = iterator.next();
				if (entry.getValue().size() > largest)
					largest = entry.getValue().size();
			}
			result.add(map.size() + " " + largest);
		}
		for (i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
	}
}