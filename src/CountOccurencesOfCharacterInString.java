
public class CountOccurencesOfCharacterInString {

	public static void main(String[] args) {
		
		String str=" I am learning Java program";
		int a=str.length();
		int count=0;
		for(int i=0;i<a;i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ' )
			{
				count++;
			}
		}
	System.out.println(count);
		

	}

}
