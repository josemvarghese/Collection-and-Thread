import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HshSet {
	public void Hset()
	{
		Set<String> hs = new HashSet<String>();
		hs.add("jose");
		hs.add("AcadGild");
		hs.add("benguluru");
		hs.add("India");
		
		 Iterator itr = hs.iterator();
		    System.out.println("Values");
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.println( element);
	      }
	}


}
