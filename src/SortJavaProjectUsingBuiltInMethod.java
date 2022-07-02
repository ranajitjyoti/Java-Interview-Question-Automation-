import java.util.Arrays;
import java.util.Collections;

public class SortJavaProjectUsingBuiltInMethod {

	public static void main(String[] args) {
		//int a[]= {50,60,10,30,20,40};
		Integer a[]= {50,60,10,30,20,40};
		System.out.println("Before Sort :"+Arrays.toString(a));
		//Arrays.parallelSort(a);
		//Arrays.sort(a);
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("After Sort :"+Arrays.toString(a));
		
		Integer num[]= {5,9,4,8,9,7,6,1,2};
		Arrays.sort(num,Collections.reverseOrder());
		System.out.println(Arrays.toString(num));
		//Arrays.sort(num,Collections.reverseOrder());

	}

}
