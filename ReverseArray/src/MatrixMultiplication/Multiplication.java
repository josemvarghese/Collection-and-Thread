package MatrixMultiplication;

import java.util.Scanner;

public class Multiplication {
	
	
//int FirstNum[][]=new int[2][3];
//int SecondNum[][]=new int[3][4];
//int ResultNum[][]=new int[10][10];
	public int multmat=0;
	
	public void mult()
	{
		System.out.println("-----------------------");
		System.out.println("-----------Matrix Multiplication------------");
		
		System.out.println("Enter the rows and colums of first matrix ");
		Scanner in = new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int FirstNum[][]=new int[m][n];
		System.out.println("enter the values to the matrix");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				FirstNum[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(FirstNum[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("Enter the rows and colums of second matrix ");
		int p=in.nextInt();
		int q=in.nextInt();
		int SecondNum[][]=new int[p][q];
		System.out.println("enter the values to the matrix");
		for(int i=0;i<p;i++){
			for(int j=0;j<q;j++){
				SecondNum[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<p;i++){
			for(int j=0;j<q;j++){
				System.out.print(SecondNum[i][j]+"\t");
			}
			System.out.print("\n");
		}
	if(n!=p)
	{
		System.out.println("Matrix multiplication is not possibile");
	}
	else
	{
		int Result[][]=new int[m][q];
		for(int i=0;i<m;i++){
			for(int j=0;j<q;j++){
				for(int k=0;k<n;k++){
					multmat=multmat+FirstNum[i][k]*SecondNum[k][j];
				}
				Result[i][j]=multmat;
				multmat=0;
			}
		}
		
		System.out.println("After Multiplication");
		
		for(int i=0;i<m;i++){
			for(int j=0;j<q;j++){
				System.out.print(Result[i][j]+"\t");

			}
			System.out.print("\n");
		}
	}
		
	
	
	
	}

}
