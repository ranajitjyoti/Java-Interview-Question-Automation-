import java.util.Arrays;

public class CheckEualityOfArrays {

	public static void main(String[] args) {
		/*int a[]= {5,6,4,8,7};
		int b[]= {5,6,4,8,7};
		boolean stat=false;
		boolean status=Arrays.equals(a, b);
		if(status==true)
		{
			System.out.println("this array's are equal");
		}
		else
		{
			System.out.println("this array's are NOT equal");
		}*/
		
		
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,7};
		
		boolean c=Arrays.equals(a,b);///boolean c= Arrays.equals(a,c)
		if(c==true)
		{
			System.out.println("same array");
		}
		else
		{
			System.out.println("Not same array");
		}
		
		
		
		/*
		int c[]= {5,6,4,8,7};
		int d[]= {5,6,4,8,7};
		
		if(c.length==d.length)
		{
			for(int j=0;j<c.length;j++)
			{
				if(c[j]!=d[j])
				{
					stat =false;
				}
			}
			
		}
		else
		{
			 stat =false;
		}
		if(stat==false)
		{
			System.out.println("Arrays are not equal");
		}
		else
		{
			System.out.println("Arrays are  equal");
		}
		*/
			

	}

}
