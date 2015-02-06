import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ArryList {
	
	public void arrayList()
	{
		List<Integer> iter =new ArrayList<Integer>(); 
		iter.add(10);
		iter.add(12);
		iter.add(14);
		iter.add(11);
		iter.add(11);
		iter.add(18);
		iter.add(19);	
		 Iterator itr = iter.iterator();
		    System.out.println("Values");
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.println( element);
	      }
		
		
	}
	
	public static void main(String []args)
	{
		ArryList ary = new ArryList();
		ary.arrayList();
		HshSet hs = new HshSet();
		hs.Hset();
		mapp hm= new mapp();
		hm.hshMap();
	
	}

}
