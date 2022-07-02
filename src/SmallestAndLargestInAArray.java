
public class SmallestAndLargestInAArray {

	public static void main(String[] args) {
		int number[]= {-1,2,3,-4,5,1};
		
		int smallest=number[0];
		int largest=number[0];
		
		for(int i=1;i<number.length;i++)
		{
			if(number[i]>largest)
			{
				largest=number[i];
			}
			else if(number[i]<smallest)
			{
				smallest=number[i];
			}
		}
		System.out.println("Largest="+largest);
		System.out.println("Smallest="+smallest);
	
	}
}
