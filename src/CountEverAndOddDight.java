
public class CountEverAndOddDight {

	public static void main(String[] args) {
		int num=44445;
		int odd=0;
		int even=0;
		while(num>0)
		{
			int digit=num%10;
			if(digit%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			num=num/10;
		}
		System.out.println(odd);
		System.out.println(even);
	}

}
