

public class StringRev {

	String s= new String("Hello my name is Jose M Varghese");
 
	public int stringleg()
	{
		return s.length();
	}
	public void revstring(int p){
		if(p<=0){
			return;
		}
		else{
			p=p-1;
			System.out.print(s.charAt(p));
			revstring(p);
		}
	}
	public static void main(String[] args) {
	
	    StringRev rev= new StringRev();
		int p=rev.stringleg();
		rev.revstring(p); 
		
	}

}
