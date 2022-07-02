import java.util.Arrays;

public class Anargram {

	public static void main(String[] args) {
		

		
		String word1="Ranajit IJyoti";
		String word2="jitRana Jyoti";
		String w1=word1.replaceAll("\\s","");
		String w2=word2.replaceAll("\\s","");
		boolean status=true;
		if(w1.length()!=w2.length())
		{
			status=false;
		}
		else
		{
			char arrw1[]=w1.toLowerCase().toCharArray();
			char arrw2[]=w2.toLowerCase().toCharArray();
			Arrays.sort(arrw1);
			Arrays.sort(arrw2);
			
			status=Arrays.equals(arrw2, arrw1);
		}
		if(status)
		{
			System.out.println("This is an anargram");
		
		}
		else
			
		{
			System.out.println("This is NOT an anargram");
		}
		
		

	}
}
