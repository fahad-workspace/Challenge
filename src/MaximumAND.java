import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumAND {

	private static Scanner sc;
	
	public static void main(String[] args) throws InterruptedException {
		
		sc = new Scanner(System.in);
		int i, j, num1, num2;
		int num = sc.nextInt();
		List<String> list1 = new ArrayList<>();
		for(i=0; i<num; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			for(j=num1; j<num2+1; j++) {
				String str = Integer.toBinaryString(j);
				int len = str.length();
				for(int k=0; k<(8-len); k++) {
					str="0"+str;
				}
//				System.out.println(str);
				list1.add(str);
			}
//			do {
//				
//				for(int k=0; k<8; k++) {
//					List<String> listtemp = new ArrayList<>();
//					for(j=0;j<list1.size();j++) {
//						System.out.println(list1.get(j));
//						if (list1.get(j).charAt(k) == '1') {
//							listtemp.add(list1.get(j));
//						}
//					}
//					if (listtemp.size()==0) {
//						continue;
//					}
//					System.out.println(listtemp.size());
//					Thread.sleep(2000);
//					if(listtemp.size()>0 && listtemp.size()<3) {
//						for(int l=0; l<listtemp.size(); l++) {
//							System.out.println(listtemp.get(l));
//							System.exit(0);
//						}
//					}
//					List<String> listtem2 = new ArrayList<>();
//					listtem2 = list1;
//					listtem2.removeAll(listtemp);
//					System.out.println(listtem2.size());
//					list1.removeAll(listtem2);
//					System.out.println(list1.size());
//					Thread.sleep(2000);
//				}
//			} while(true);
		}

	}

}
