
public class PrimeNumberNot {

	public static void main(String[] args) {
//		int num=13;
//		int res=0;
//		
//		for(int i=2;i<num;i++)
//		{
//			if(num%i==0)
//			{
//				res=res+1;
//				
//			}
//					
//		}
//		if(res==0)
//		{
//			System.out.println("This is a prime number");
//		}
//		else
//		{
//			System.out.println("This is not a prime number");
//		}
		int num=98;
		int sum=0;
		
		for(int i=2;i<=(num/2);i++)
		{
		   if(num%i==0)
		   {
			   sum=sum+1;
		   }
		}
		if(sum==0)
		{
		System.out.println("Ptime numberr");
		}
		else
		{
		System.out.println("not a prime number");
		}
	}

}
