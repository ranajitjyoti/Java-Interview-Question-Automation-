
public class FindMaxAndMinInArray {

	public static void main(String[] args) {
	int a[]= {10,25,12,88,02,54};
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<max)
		{
			max=a[i];
		}
	}
	System.out.println("Bug number is "+max);
	
	}
}

/*
 * int []st={1,2,3,4,}
 * 
 * st[0]=max;
 * for(int i=0;i<a.length;i++)
 * {
 *   if(st[i]>max)
 *   {
 *   	max =st[i];
 *   }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * */
