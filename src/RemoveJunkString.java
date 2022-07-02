
public class RemoveJunkString {
	public static void main(String[] args) {
		
		String s="@#$%^&* Ranajit Jyoti #$%^& I am 9898987888";
		//String st=s.replaceAll("[^a-zA-Z0-9]", " ");
		// Here we are using Regular Expression
		String st=s.replaceAll("[^a-zA-Z0-9 ]","" );//sreplaceAll("[^A-Za-z0-9]")
		System.out.println(st);
	}

}
