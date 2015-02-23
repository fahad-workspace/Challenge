import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer[]> myList = new ArrayList<>();
		Integer[] arr;
		for(int i=1; i<=10; i++) {
			for(int j=i; j<=10; j++) {
				arr = new Integer[2];
				arr[0]=i;
				arr[1]=j;
				myList.add(arr);
			}
		}
		System.out.println(myList.size());
		for(int i=0; i< myList.size(); i++)
			System.out.println(myList.get(i)[0] + "-" + myList.get(i)[1] );
		int count = 0;
		for(int loop=0; loop<myList.size();loop++){
			Integer[] arr1 = myList.get(loop);
			int temp=arr1[0];
			System.out.println(arr1[0] + "-" + arr1[1]);
			for(int i=arr1[0]+1; i<=arr1[1]; i++){
				temp = temp^i;
				for(int xx=0; xx<loop; xx++)
					System.out.print(" ");
				System.out.println(temp);
			}
			
			if(temp >= 3 && temp <=7)
				count++;
		}
		System.out.println(count);
	}
}