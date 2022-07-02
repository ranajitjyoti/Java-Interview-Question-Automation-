

public class StarPattern {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		}
				
	}


/**********************************************
 normal start pattern                         *
                                              *
for(int i=5;i>=0;i--)                         *
{                                             *
	for(int j=0;j<=i;j++)                     *
		{                                     *
			System.out.print("*");            *
		}                                     *
	System.out.println();                     *
}                                             *
***********************************************/
/**********************************************
 Pryamid star pattern
 for(int i=0;i<5;i++)
				{
					for(int j=5;j>i;j--)
					{
						System.out.print(" ");
					}
					for(int r=0;r<=i;r++)
					{
					System.out.print(" *");
					}
					System.out.println("");
				}
**********************************************/
					
					
