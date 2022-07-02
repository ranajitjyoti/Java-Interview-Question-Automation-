
public class HowToReverseAStringPractice {

	public static void main(String[] args) {
		String s="Hellow World";
		int lnt=s.length();
		String rev="";
		
		for(int i=(lnt-1);i>=0;i--)
		{
			
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		StringBuffer st=new StringBuffer(s);
		System.out.println(st.reverse());
			

	}

}
