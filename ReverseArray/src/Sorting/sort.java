package Sorting;

import java.util.Scanner;

public class sort {
	int []sorting=new int[15];
	
	public void srting(){
		
			System.out.println("\n-----------Sorting------------------");			
			int[]sorting={-9, -7, -3, -2, 0, 2, 4, 5, 6, 8};//Inpt.nextInt();
			System.out.println("\n-----------Before Sorting------------------");			
			for(int i=0;i<sorting.length;i++)
			{
				System.out.print("\t"+sorting[i]);			
			}
			for (int i = (sorting.length - 1); i >= 0; i--)
			   {
			      for (int j = 1; j <= i; j++)
			      {
			         if (sorting[j-1] > sorting[j])
			         {
			              int temp = sorting[j-1];
			              sorting[j-1] = sorting[j];
			              sorting[j] = temp;
			   } } }
			System.out.print("\n-----------After Sorting------------------\n");	
			for(int i=0;i<sorting.length;i++)
			{
				System.out.print("\t"+sorting[i]);			
			}
			//System.out.println("--\n"+sorting.length);	
		//	sorting[10]=1;
		//	System.out.println("----------"+sorting[10]);

			
	}

	public void insertElement() 
	{
		//System.out.print("--"+sorting.length);
		//srting();
		//sorting[sorting.length+1]=1;
		//srting();
		
	}
}
