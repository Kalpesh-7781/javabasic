package com.Twodimesional;
import java.util.Scanner;

/*Direct Initialization of 2D Array*/

/*public class TestTwoDArray {
	public static void main(String [] args) {
		int a[][]= {
				{4,5},
				{5,6},
				{7,8}
					};
		System.out.println(a.length);
		System.out.println("DIsplay array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		}
	}*/
	
/* 2D Array Input from user*/


/*public class TestTwoDArray {
	public static void main(String [] args) {
		int a[][]= new int [3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements of 2D array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(a.length);
		System.out.println("DIsplay array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		}
	}*/
	

/*2D Array using Method*/


/*public class TestTwoDArray {
	
		int [][] input()
		{
			int a[][]= new int [3][2];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Elements of 2D array");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			return a;
		}
		
		void display(int a[][]){
			System.out.println("DIsplay array");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
		}
		public static void main(String [] args) {
			TestTwoDArray ob=new TestTwoDArray();
			int a[][]=ob.input();
			
			ob.display(a);
			
		}	
	}*/
	
/*Sum of 2D Array*/

/*public class TestTwoDArray {
	
	int [] [] input(){
		int a[][]= new int [3][2] ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements : ");
		
		for(int i=0 ; i<a.length; i++) {
			for(int j=0; j< a[i].length; j++) { 
				a[i][j] = sc.nextInt();
				
			}
		}
		return a ;
	}
	
	void display (int a[][]) {
		System.out.println("\nDisplaying the elements :");
		for(int i=0 ; i<a.length; i++) {
			for(int j=0; j< a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}	
	}	
	
	int add(int a[][]) {
		int sum = 0 ;
		System.out.println("\nDisplaying the elements :");
		for(int i=0 ; i<a.length; i++) {
			for(int j=0; j< a[i].length; j++) {
				sum += a[i][j];
			}
		}
		return sum ;
	}

	public static void main(String[] args) {

		
		TestTwoDArray ob = new TestTwoDArray();
		int a[][ ]= ob.input();
		ob.display(a);
		int sum = ob.add(a);
		System.out.println(sum);
	}		
}*/

/*Sum of Even & Odd using Array*/

/*public class TestTwoDArray {
	
	int [] [] input(){
		int a[][]= new int [3][2] ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements : ");
		
		for(int i=0 ; i<a.length; i++) {
			for(int j=0; j< a[i].length; j++) { 
				a[i][j] = sc.nextInt();
				
			}
		}
		return a ;
	}
	
	void display (int a[][]) {
		System.out.println("\nDisplaying the elements :");
		for(int i=0 ; i<a.length; i++) {
			for(int j=0; j< a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}	
	}	
	
	int add(int a[][]) {
		int sum = 0 ;
		System.out.println("\nDisplaying the elements :");
		for(int i=0 ; i<a.length; i++) {
			for(int j=0; j< a[i].length; j++) {
				sum += a[i][j];
			}
		}
		return sum ;
	}
	void evenOddSum(int a[][])
	{
		int evenSum=0,oddSum=0;
		for(int i=0 ; i<a.length; i++) 
		{
			for(int j=0; j< a[i].length; j++) 
			{
				if(a[i][j]%2==0)
					evenSum+= a[i][j];
				else
					oddSum+=a[i][j];
			}
		}
	System.out.println("Even Sum="+" "+evenSum+" "+"Odd Sum="+oddSum);
	}

	public static void main(String[] args) {

		
		TestTwoDArray ob = new TestTwoDArray();
		int a[][ ]= ob.input();
		ob.display(a);
		ob.evenOddSum(a);
	}		
}*/

public class TestTwoDArray {
	
	int [][] input () {
		int a [][] = new int [3][2];
		System.out.println("Enter array:");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
			}
				
		}
		return a;
	}
	
	void display (int a [][]){
		System.out.println("Display Array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) {
				System.out.println(a[i][j] + "\t");
			}
		
		}
	}
}

	

