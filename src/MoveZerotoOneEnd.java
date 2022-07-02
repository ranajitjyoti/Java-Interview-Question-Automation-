import java.util.Arrays;

public class MoveZerotoOneEnd {

	public static void main(String[] args) {
		int arr[]= {1,2,5,0,0,5,0,4,3,0,5,2,0,0};
		int len=arr.length;
		int count=0;
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
			
		}
		
		while(count<len)
		{
			arr[count++]=0;
		}
		 for(int j=0;j<len;j++) {
			 System.out.print(arr[j]);
		 }
		 System.out.println(Arrays.toString(arr));

	}

}
