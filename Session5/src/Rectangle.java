import java.util.Scanner;


public class Rectangle  implements Area {
	
	public int length;
	public int bredth;;


	public void draw() {
		
	}

	public void getArea() {
		
		System.out.println("Area of the Rectangle="+length*bredth);
	
	}
public void getsides(){
		
		Scanner getR=new Scanner(System.in);
		System.out.println("Enter the Length");		
		length=getR.nextInt();
		System.out.println("Enter the Bredth");
		bredth=getR.nextInt();
}

}
