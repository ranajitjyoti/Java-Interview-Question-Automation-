
public class SearchElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,50,40,80};
		int ser_ele=80;
		boolean ticket=true;
		for(int i=0;i<a.length;i++)
		{
			if(ser_ele==a[i])
			{
				System.out.println("Element founf at :> "+i);
				//ticket=true;
			}
			else
			{
				ticket=false;
			}
		}
		if(ticket==false)
		{
			System.out.println("NO Element founD  ");
		}
		
	}

}
