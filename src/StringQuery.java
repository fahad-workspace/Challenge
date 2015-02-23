import java.util.Scanner;

public class StringQuery {

	private static Scanner sc;
	private static String str, ch, strTemp;
	private static String[] splitStr;
	private static int num, i, j, position, splitStrLength;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		str = sc.next();
		num = sc.nextInt();
		for (i = 0; i < num; i++) {
			position = sc.nextInt();
			ch = sc.next();
			splitStr = str.split(ch);
			strTemp = "";
			splitStrLength = splitStr.length;
			for (j = 0; j < splitStrLength; j++) {
				strTemp = strTemp + splitStr[j];
				if (j != position - 1 && j != splitStrLength - 1)
					strTemp = strTemp + ch;
			}
			str = strTemp;
		}
		System.out.println(str);
	}
}
