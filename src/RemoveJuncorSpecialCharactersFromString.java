
public class RemoveJuncorSpecialCharactersFromString {

	public static void main(String[] args) {
		String s="@#$%^& My Name is @#$^& Rana#$jit Jyo#$%^ti";
		s=s.replaceAll("[^A-Za-z0-9 ]"," ");
		System.out.println(s);
		
		
		String k="QWER@#$%^&*sdfghj%^&*";
		String j=k.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(j);
		
		
		String l="QWERT@#$%^&*(*&^fu1344";
		String hj=l.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(hj);
		
		String str="Ra@#$%^nait Jyoti 5";
		String sdf=str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(sdf);
	}

}
