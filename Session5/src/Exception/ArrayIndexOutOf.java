package Exception;

public class ArrayIndexOutOf {
	
	public int Arayindex[]={1,2,3,4,5};
	
	public void Arraybound()
	{
		System.out.println("---------------ArrayIndexOutOfBoundsException---------");
		System.out.println("The value in the seventh position  +Arayindex[6]");
	try{
		System.out.println("The value in the seventh position"+Arayindex[6]);
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println("The Array Index Out Of Bounds Exception");
	}
	}

}
