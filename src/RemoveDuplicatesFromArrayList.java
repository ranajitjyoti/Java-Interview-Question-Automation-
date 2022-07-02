import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
	List<String> i=new ArrayList<>();// li=nre arraylisr();st<string> dt st,add
	i.add("Mango");
	i.add("Apple");
	i.add("Mango");
	i.add("Pine");
	i.add("Mango");
	i.add("Pine");
	i.add("Grape");
	System.out.println(i.toString());
	Set<String> s=new LinkedHashSet<>(i);
	System.out.println(s.toString());

	}

}
