package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		System.out.println("addition-1: Sub-2:mul-3: div-4:");
		
		char ch=sc.next().charAt(0);
		
		
		
		switch(ch)
		{
		case '1':
			System.out.println("addition of two numbers:"+(a+b));
			 break;
			 
		case '2':
			System.out.println("addition of two numbers:"+(a-b));
			 break;
		case '3':
			System.out.println("addition of two numbers:"+(a*b));
			 break;
		case '4':
			System.out.println("addition of two numbers:"+(a/b));
			 break;	 
			 default:
				 System.out.println("invalid number");
	}
	}

}
