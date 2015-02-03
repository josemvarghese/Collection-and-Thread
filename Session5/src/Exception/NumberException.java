package Exception;

public class NumberException {
	public int num;
	public void numException()
	{
		System.out.println("---------------NumberFormatException---------");
		 System.out.println("num=Integer.parseInt ("+"XYZ"+")");
		try{
			
		 num=Integer.parseInt ("XYZ") ; 
			}
		catch(NumberFormatException e)
		{
			System.out.println("The Number Format Exception "+num);

		}
	}

}
