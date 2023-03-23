package calculator;

import java.util.Scanner;

public class switchusingcalculator {
	public static void main(String[] args) {
		
	
	int  num1,num2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	num1=sc.nextInt();
	System.out.println("enter the second number");
	num2=sc.nextInt();
	System.out.println("enter a operator(+,-,*,/):");
	char op=sc.next().charAt(0);
	int output;
	switch(op)
	{ 
	
	case '+': output=num1+num2;
	          System.out.println(output);
	          break;
	case '-':  output=num1-num2;
	System.out.println(output);
	           break;
	case '*':  output=num1*num2;
	System.out.println(output);
                 break;
	case '/':  output=num1/num2;
	System.out.println(output);
                  break;
                  
                  
                default:
                
          System.out.println("you have entered wrong opeator");
          break;
          
}
	}
}