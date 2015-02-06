import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class mapp {
	
	public void hshMap(){
		
	Map<Integer,String> hp = new HashMap<Integer,String>();
	hp.put(1, "tutorials");
	hp.put(2, "point");
	hp.put(3, "is the best");
	hp.put(4, "tutorials");
	Set st= hp.entrySet();
	System.out.println("set values");
	System.out.println(st);

	
	
	}

}
