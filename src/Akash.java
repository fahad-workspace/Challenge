import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Akash {
	
	private static Scanner sc;
	private static List<Character> myList;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int i, L, R, K, count;
		int numOfChar = sc.nextInt();
		int numOfQuery = sc.nextInt();
		Set<Character> mySet;
		Iterator<Character> iterator;
		myList = new ArrayList<Character>();
		String str = sc.next();
		char[] charList = new char[numOfChar];
		charList = str.toCharArray();
		for (i = 0; i < numOfChar; i++) {
			myList.add(charList[i]);
		}
		List<String> result = new ArrayList<String>();
		for (i = 0; i < numOfQuery; i++) {
			L = sc.nextInt();
			R = sc.nextInt();
			K = sc.nextInt();
			count = 0;
			mySet = new TreeSet<Character>(myList.subList(L - 1, R));
			iterator = mySet.iterator();
			if (mySet.size() < K)
				result.add("Out of range");
			else {
				while (iterator.hasNext()) {
					count++;
					if (count == K) {
						result.add(iterator.next().toString());
						continue;
					}
					iterator.next();
				}
			}
		}
		for (i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}