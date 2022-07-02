
public class LowerUpperCaseInString {

	public static void main(String[] args) {
		String  name="CaPjEmInI123";
		int len=name.length();
		int ucase=0;
		int Lcase=0;
		int number=0;
		
		for( int i=0;i<len;i++)
		{
			char ch=name.charAt(i);
			if(ch>='A' && ch <='Z')
			{
				ucase++;
			}
			else if (ch>='a' && ch <='z')
			{
				Lcase++;
			}
			
			else if (ch>='0' && ch <='9')
			{
				number++;
			}
				
		}
		System.out.println("ucase="+ucase+" Lcase="+Lcase+" number="+number);
	}

}
