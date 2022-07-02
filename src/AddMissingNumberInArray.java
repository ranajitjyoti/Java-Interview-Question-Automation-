
public class AddMissingNumberInArray {

	public static void main(String[] args) {
		/*int a[]= {1,2,3,4,5,6,7,8,10};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		for(int j=0;j<=10;j++)
		{
			sum2=sum2+j;
		}
		int sum3=sum2-sum1;
		System.out.println("Missing number is : "+sum3); 
		*/
		
		int a[]= {1,3,4,5,6,7,8};
		int sum1=0;
		int sum2=0;
		int len=a.length;
		
		for(int i=0;i<len;i++)
		{
			sum1=sum1+a[i];
		}
		
		for(int j=0;j<=len+1;j++)
		{
			sum2=sum2+j;
		}
		System.out.println("missing number is "+(sum2-sum1));
	}

}
