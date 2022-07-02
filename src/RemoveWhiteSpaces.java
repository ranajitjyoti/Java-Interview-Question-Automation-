
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="MY Name is    ranajit Jyoti";
		System.out.println("Before removing the spaces  :" +str);
		str=str.replaceAll("\\s", "");// st.replaceall("\\s",")//str.replaceAll(""\\s,"")
		System.out.println("After removing the spaces  :" +str); 
		str=str.replaceAll("\\s","");
	}

}
