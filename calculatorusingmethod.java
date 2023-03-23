package calculator;

import java.util.Scanner;

public class calculatorusingmethod
{
	
	static Scanner sc1=new Scanner(System.in);
	
//	  static int a=sc1.nextInt();
//	static int b=sc1.nextInt();
	public static void main(String[] args) 
	{
		
	
	//sc=new Scanner(System.in);
//	System.out.println("ente a  first number");
//	int a=sc.nextInt();
//	System.out.println("ente a  first number");
//	int b=sc.nextInt();
//	System.out.println("select operator(+,-,*,/):)");
	System.out.println("select 1:add(),2:sub(),3:mul(),4:div()");
	
int ch=sc1.nextInt();
	//System.out.println("select 1:add(),2:sub(),3:mul(),4:div()");
	
	switch(ch)
	{
	case 1:add();
	{
		
	}
	       break;
	case 2:sub();
	       break;
	case 3:mul();
	       break;
	case 4:div();
	       break;
	default:
		 System.out.println("invalid number");
	}
	}
	
	static void add()
	{    System.out.println("enter a first number");
		 int a=sc1.nextInt();
		 System.out.println("enter a second number");
		 int b=sc1.nextInt();
		 
		 
		
		
		System.out.println(a+b);
	}
		
	static void sub()
	{
		//System.out.println(" +a+b");
	}
	static void mul()
	{
		//System.out.println(" +a+b");
	}
	static void div()
	{
		//System.out.println(" +a+b");
	}
	
	
	


}
