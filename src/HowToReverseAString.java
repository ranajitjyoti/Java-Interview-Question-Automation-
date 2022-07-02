
public class HowToReverseAString {

	public static void main(String[] args) {
//		String str="ABCD";
//		String rev="";
//		int len=str.length();
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);
//		String st="RANAJIT";
//		StringBuffer s=new StringBuffer(st);
//		StringBuffer k=s.reverse();
//		System.out.println(k);
		
		String str="Ranajit"; 
		String k="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			k=k+str.charAt(i);
		}
		System.out.println(k);
		
	}

}
