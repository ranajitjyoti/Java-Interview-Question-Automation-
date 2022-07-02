
public class FindOddAndEvenInArray {

	public static void main(String[] args) {
		int a[]= {5,6,7,8,9,5,3,11,16,19};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+": is a even number");
			}
			else
			{
				System.out.println(a[i]+" is a odd number");
			}
		}
				

	}

}
