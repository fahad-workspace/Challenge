import java.math.BigInteger;
import java.util.Scanner;

public class Bholu {

	private static Scanner sc;
	private static int i;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		short n = sc.nextShort();
		int[][] result = new int[n][2];
		BigInteger mod = new BigInteger("" + 1000000007);
		for (i = 0; i < n; i++) {
			BigInteger a = new BigInteger("" + sc.nextInt());
			BigInteger b = new BigInteger("" + sc.nextInt());
			BigInteger c = new BigInteger("" + sc.nextInt());
			BigInteger hcf = ((a.gcd(b)).gcd(c));
			result[i][0] = hcf.intValue();
			result[i][1] = ((a.multiply(b).multiply(c)).divide(hcf.pow(3))
					.mod(mod)).intValue();
		}
		for (i = 0; i < n; i++) {
			System.out.println(result[i][0] + " " + result[i][1]);
		}
	}
}