import java.util.Arrays;

public class ReverseAnString {

	public static void main(String[] args) {
		/*String a="My name is Ranajit";
		String arr[]=a.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			//System.out.print( arr[i]+" ");
			String word=arr[i];
			int len=word.length();
			//System.out.println(len);
			String rev="";
			//StringBuilder sb=new StringBuilder(word);
			
			//System.out.print(sb.reverse()+" ");
			String revs="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				revs=revs+word.charAt(j);
				
			}
			System.out.print(revs+" ");*/
		String str="My name is ranajit";
		String st[]=str.split(" ");//String st[]=str.split(" ");// int len=st.length;
		
		int len=st.length;
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
			String word=st[i];
			String rev="";
			
			for(int j=st[i].length()-1;j>=0;j--)
			{
				
				rev=rev+word.charAt(j);
						}
			System.out.print(rev);
		}
			

	}

}
