import java.util.ArrayList;
import java.util.Iterator;



public class IteratorInJava {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			ar.add(i);
			
		}
		System.out.println(ar.toString());
		
		Iterator itr=ar.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				itr.remove();
			}
		}
		System.out.println(ar.toString());
		

	}

}
