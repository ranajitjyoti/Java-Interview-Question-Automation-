import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		
		String names []= {"java","javascript","python","c","java","python"};
		//compare each elements
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equalsIgnoreCase(names[j]))
				{
					System.out.println("Duplicate number is "+names[i]);
				}
			}
		}
		System.out.println("******************************************************************************");
		Set<String> store=new HashSet<String>();
		for(int i=0;i<names.length;i++)
		{
			if(store.add(names[i])==false)
					{
						System.out.println("Duplicate element is "+names[i]);
					}
		}
		System.out.println("******************************************************************************");
		
		Set<String> stores=new HashSet<String>();
		for(String name :names)
		{
			if(stores.add(name)==false)
					{
						System.out.println("Duplicate elment is "+name);
					}
		}
		
		
	}

}
