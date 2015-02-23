import java.util.Random;

public class Testing {
	public static void main(String[] args) {
		int T = Testing.random(1, 50);
		System.out.println(T);
		for (int i = 0; i < T; i++) {
			System.out.println(Testing.random(0, 1000000) + " "
					+ Testing.random(0, 19));
		}
	}

	private static int random(int low, int high) {
		Random r = new Random();
		return (r.nextInt(high - low) + low);
	}
}