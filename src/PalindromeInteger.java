import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a String : ");
//	String str=sc.next();
	String str="BCABCB";
	String rev="";
	String st=str;
	
	int len=str.length();
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println("Reverse number is :"+rev);
	
	if(rev.equals(st))//rev.equals(st)
	{
		System.out.println("Ths is Palindrome :");
	}
	else
	{
		System.out.println("This is not Palindrome");
	}
	}
}
