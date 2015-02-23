import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WengaluruCity {

	private static Scanner sc;
	private static int numOfTestCases, i, j, numOfBuildings, k;
	private static List<Integer> buildingHeight, tempBuilding;
	private static List<Integer> output = new ArrayList<>();
	private static BigInteger result;
	private static BigInteger mod = new BigInteger("" + 1000000007);

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		numOfTestCases = sc.nextInt();
		for (i = 0; i < numOfTestCases; i++) {
			numOfBuildings = sc.nextInt();
			buildingHeight = new ArrayList<>();
			for (j = 0; j < numOfBuildings; j++) {
				buildingHeight.add(sc.nextInt());
			}
			tempBuilding = new ArrayList<>(buildingHeight);
			Collections.sort(tempBuilding);
			result = new BigInteger("" + 0);
			for (j = tempBuilding.size() - 1; j > 0; j--) {
				if (buildingHeight.indexOf(tempBuilding.get(j)) != buildingHeight
						.lastIndexOf(tempBuilding.get(j))) {
					result = result.add(new BigInteger(
							""
									+ ((buildingHeight.lastIndexOf(tempBuilding
											.get(j)) - buildingHeight
											.indexOf(tempBuilding.get(j))) - 1)
									* tempBuilding.get(j)));
					for (k = buildingHeight.lastIndexOf(tempBuilding.get(j)) - 1; k > buildingHeight
							.indexOf(tempBuilding.get(j)); k--) {
						result = result.subtract(new BigInteger(""
								+ buildingHeight.get(k)));
						buildingHeight.remove(k);
					}
				} else {
					if (buildingHeight.indexOf(tempBuilding.get(j - 1)) < 0)
						continue;
					result = result.add(new BigInteger(""
							+ ((Math.abs((buildingHeight.indexOf(tempBuilding
									.get(j)) - buildingHeight
									.indexOf(tempBuilding.get(j - 1))))) - 1)
							* tempBuilding.get(j - 1)));
					if (buildingHeight.indexOf(tempBuilding.get(j)) > buildingHeight
							.indexOf(tempBuilding.get(j - 1))) {
						for (k = buildingHeight.indexOf(tempBuilding.get(j)) - 1; k > buildingHeight
								.indexOf(tempBuilding.get(j - 1)); k--) {
							result = result.subtract(new BigInteger(""
									+ buildingHeight.get(k)));
						}
					} else {
						for (k = buildingHeight
								.indexOf(tempBuilding.get(j - 1)) - 1; k > buildingHeight
								.indexOf(tempBuilding.get(j)); k--) {
							result = result.subtract(new BigInteger(""
									+ buildingHeight.get(k)));
						}
					}
					if (buildingHeight.indexOf(tempBuilding.get(j)) > buildingHeight
							.indexOf(tempBuilding.get(j - 1))) {
						for (k = buildingHeight.indexOf(tempBuilding.get(j)) - 1; k > buildingHeight
								.indexOf(tempBuilding.get(j - 1)); k--) {
							buildingHeight.remove(k);
						}
					} else {
						for (k = buildingHeight
								.indexOf(tempBuilding.get(j - 1)) - 1; k > buildingHeight
								.indexOf(tempBuilding.get(j)); k--) {
							buildingHeight.remove(k);
						}
					}
				}
			}
			output.add((result.mod(mod)).intValue());
		}
		for (i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
	}
}