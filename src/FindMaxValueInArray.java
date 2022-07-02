
public class FindMaxValueInArray {

	public static void main(String[] args) {
		int []value= {1,5,10,6,9,45,5};
		int len=value.length;
		int max=value[0];
		for(int i=1;i<len;i++)
		{
			if(value[i]>max)
			{
				max=value[i];
			}
		}
		System.out.println("max value is "+max);
		
	}

}
