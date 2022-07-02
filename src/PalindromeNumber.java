import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number :");
//		int number=sc.nextInt();
//		int num=number;
//		int rev=0;
//		
//		while(number !=0)
//		{
//			rev=rev*10 + number%10;
//			number = number/10;
//		}
//		System.out.println("Rev num  ="+rev);
//		if(num==rev)
//		{
//			System.out.println("Entered number is a palindrome :");
//		}
//		else
//		{
//			System.out.println("Entered number is not palindrome: ");
//		}
		
		int num=1234;
		int cat=num;
		//int s=0;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		if(cat==rev)
		{
			System.out.println("its a palindrome number");
		}
		else
		{
			System.out.println("its not palindrome number");
		}
			
				
	}

}
