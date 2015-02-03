import java.util.Scanner;

import AbstractExample.ElectricBassGuitar;
import AbstractExample.ElectricGuitar;
import Exception.ArrayIndexOutOf;
import Exception.NumberException;
import Exception.StringException;
import Exception.nullEx;


public class CircleArea implements Area{

	public int radious;

	public static void main(String[] args) {
		CircleArea Ca=new CircleArea();
		Ca.getRadius();
		Ca.getArea();
		Rectangle Ra=new Rectangle();
		Ra.getsides();
		Ra.getArea();
		ArrayIndexOutOf aryindex = new ArrayIndexOutOf();
		aryindex.Arraybound();
		NumberException numex =  new NumberException();
		numex.numException();
		StringException se=new StringException();
		se.stirngex();
		nullEx nulex=new nullEx();
		nulex.nullExc();
		ElectricGuitar eg=new ElectricGuitar();
		eg.play();
		ElectricBassGuitar ebg=new ElectricBassGuitar();
		ebg.play();
	}

	public void draw() {
		
		
	}

	public void getArea() {
		
		System.out.println("Area of the Circle="+3.14*radious*radious);
	
	}
	
	public void getRadius(){
		
		Scanner getR=new Scanner(System.in);
		System.out.println("Enter the radius");
		radious = getR.nextInt();
		
	}

}
