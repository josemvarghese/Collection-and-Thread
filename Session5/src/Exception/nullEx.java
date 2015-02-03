package Exception;

public class nullEx {
	public String st=null;
	
	public void nullExc()
	{	
		System.out.println("---------------NullPointerException---------");
		System.out.println("The String is + st.charAt(0)");
		try
		{
			System.out.println("The String is"+st.charAt(0));
		}
		catch(NullPointerException np)
		{
			System.out.println("The Null Pointer Exception");
		}
	}

}
