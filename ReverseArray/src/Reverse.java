import MatrixMultiplication.Multiplication;
import Sorting.sort;


public class Reverse {

	public void Reverseing()
	{
		int []reverse={10,12,13,14,15,16,17,18,19,20};
		System.out.println("Before reversing");
		for(int i=0;i<reverse.length;i++)
		{
			System.out.print( reverse[i]+",");
		}
		System.out.println("\n");
		System.out.println("After reversing ");
		for(int j=reverse.length-1;j>=0;j--)
		{
			System.out.print( reverse[j]+",");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Reverse rev= new Reverse();
		rev.Reverseing();
		stringArray str=new stringArray();
		str.StringAry();
		Multiplication mult=new Multiplication();
		mult.mult();
		sort srt=new sort();
		srt.srting();
		

	}

}
