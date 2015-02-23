import java.util.Scanner;

public class BrioHouse {

	private static Scanner sc;
	private static float side1, side2, side3, radius;

	public static void main(String[] args) {
		int num, i;
		String[] result;
		float area;
		sc = new Scanner(System.in);
		num = sc.nextInt();
		result = new String[num];
		for (i = 0; i < num; i++) {
			side1 = sc.nextFloat();
			side2 = sc.nextFloat();
			side3 = sc.nextFloat();
			BrioHouse.radiusCalculator();
			area = 3.1415f * radius * radius;
			result[i] = String.format("%.4f", area);
		}
		for (i = 0; i < num; i++) {
			System.out.println(result[i]);
		}
	}

	private static void radiusCalculator() {
		radius = (float) ((side1 * side2 * side3) / (Math
				.sqrt((side1 + side2 + side3) * (side2 + side3 - side1)
						* (side3 + side1 - side2) * (side1 + side2 - side3))));
	}

}