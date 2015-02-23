import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Xsquare {

	private static Scanner sc;
	static List<Integer> result = new ArrayList<Integer>();
	static Set<Character> chset1;
	static Set<Character> chset2;
	static List<Character> chlist;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int numOfCases = sc.nextInt();
		int i, j;
		for (i = 0; i < numOfCases; i++) {
			chset1 = new HashSet<>();
			chset2 = new HashSet<>();
			chlist = new ArrayList<>();
			String str = sc.next();
			char[] ch = str.toCharArray();
			for (j = 0; j < ch.length; j++) {
				chlist.add(ch[j]);
				chset1.add(ch[j]);
			}
			for (Character s : chset1) {
				chlist.remove(s);
			}
			for (j = 0; j < chlist.size(); j++) {
				chset2.add(chlist.get(j));
			}
			if(chset1.equals(chset2) && chset2.size()==chlist.size())
				result.add(1);
			else
				result.add(-1);
		}
		for (i = 0; i < numOfCases; i++)
			System.out.println(result.get(i));
	}
}