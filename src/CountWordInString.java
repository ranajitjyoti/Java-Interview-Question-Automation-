
public class CountWordInString {

	public static void main(String[] args) {
		
		String str="Ranajit Jyoti is a good student but his behavior is not good";
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			{
				count++;
			}
			
		}
		System.out.println("NUMBER OF WORDS IN GIGEN WORD IS : "+count);
	}

}
