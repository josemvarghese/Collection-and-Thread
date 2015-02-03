package Exception;

public class StringException {
	public String stringIndex="abcdef";
	public void  stirngex(){
		
		System.out.println("---------------StringIndexOutOfBoundsException---------");
		System.out.println("stringIndex=abcdef");
	try{
		System.out.println("The String in the seventh position  stringIndex.charAt(6)"+stringIndex.charAt(6));
	}
	catch(StringIndexOutOfBoundsException se)
	{
		System.out.println("The String Index Out Of Bounds Exception");
	}
	}

}
