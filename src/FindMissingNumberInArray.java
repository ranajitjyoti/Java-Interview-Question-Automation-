
public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,8};
		int sum=0;
		
		for(int j=0;j<a.length;j++)
		{
			sum=sum+a[j];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int k=0;k<=(a.length+1);k++)
		{
			sum1=sum1+k;
		}
		System.out.println(sum1);
		System.out.println("missing number is : : "+(sum1-sum));
	}


}
