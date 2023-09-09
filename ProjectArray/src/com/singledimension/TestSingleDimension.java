package com.singledimension;
import java.util.Scanner;
/*
public class TestSingleDimension {
	public static void main(String[] args) {
		int marks[]= {80,60,40,30};
		
		for(int i=0;i<4;i++) {
			System.out.println(marks[i]);
		}
	}
} */

// create array object using new keyword

/* public class TestSingleDimension {
	public static void main(String[] args) {
		int size;
		System.out.println("Enter size of an array");
		size=new Scanner(System.in).nextInt();
		int marks[]= new int[size];
		
		for(int i=0;i<size;i++) 
		{
			marks[i]= new Scanner(System.in).nextInt();
		}
		System.out.println("Display Array");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(marks[i]);
		}
	}
}*/

// Character

/*public class TestSingleDimension {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch[]= new char[5];
		System.out.println("Enter Character");
		for(int i=0;i<5;i++) 
		{
			ch [i]= sc.next().charAt(0);
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(ch[i]);
		}
	}
}*/


//Count of a vowel with Case Sensitive* 

/*public class TestSingleDimension {

	public static void main(String[] args) {
		int vowel=0,consonent=0;
		Scanner sc=new Scanner(System.in);
		
	char ch[]=new char[5];
	System.out.println("Enter Character");
	
	for(int i=0;i<5;i++) {
		ch[i]=sc.next().charAt(0);
	}
	for(int i=0;i<5;i++) {
		System.out.println(ch[i]);
	}
	for(int i=0;i<ch.length;i++) 
	{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u' ||  ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U' ) {
			vowel++;
		}
		else if((ch[i]>='a'&&ch[i]<='z') || (ch[i]>='A'&&ch[i]<='Z'))
		{
			consonent++;
		}
	}
	System.out.println("Vowels are "+vowel);
	System.out.println("Consonents are "+consonent);
		
	}
	}*/

/*public class TestSingleDimension {

	int [] input()
	{
		int size;
		System.out.println("Enter size of an array");
		size=new Scanner(System.in).nextInt();
		
		int []marks=new int[size]; 
		
		System.out.println("Enter element in an array");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=new Scanner(System.in).nextInt();
		}
		
		return marks;
	}
	
	void display(int m[]){
		for(int i=0;i<m.length;i++)
		{
			System.out.println([i]);
		}
	}
	public static void main(String[] args) {
		
		
		TestSingleDimension ob=new TestSingleDimension();
		int []marks=ob.input();
		
		System.out.println("Display Array");
		
		ob.display(marks);
		

	}
}*/

// Count of vowels & consonant Using functions

/*public class TestSingleDimension
{
	char[] input() {
		Scanner sc=new Scanner(System.in);
		   char ch[]=new char[5];
		   int vowel=0,consonent=0;
		   System.out.println("Enter the Characters:");

		   for(int i=0;i<5;i++)
		   {
			   ch[i]=sc.next().charAt(0);
			   
		   }
		   return ch;
	}
	void display(char c[])
	{
		for(int i=0;i<5;i++)
		   {
			 System.out.println(c[i]);
		   }
	}
	void find(char ch[]) {
		int vowel=0,consonent=0;
		for(int i=0;i<ch.length;i++)
		   {
			   if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			   {
				   vowel++;
			   }
			   else if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
			   {
				   consonent++;
			   }
			   
		   }
		      System.out.println("Vowels are: "+vowel);
		      System.out.println("Consonents are: "+consonent);
	}
	public static void main(String[]args) {

		TestSingleDimension ob = new TestSingleDimension();
		char c[]=ob.input();
		ob.display(c);
		ob.find(c);
	}
	
}*/


public class TestSingleDimension{
	public static void main(String [] args)
	{
		int size;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		int [] a =new int  [size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int min= Integer.MAX_VALUE;
		for(int ele:a) {
			if(ele<min) {
				min=ele;
			}
		
		
	}
		System.out.println("minimun no is :" +min);
	}
}