package com.myproject;

import java.util.Scanner;

public class FactorialAndFibonacci {

	public static void main(String[] args) {
		int option, varCase;
		Scanner input = new Scanner (System.in);
		do
		{
			System.out.println("---Implementation of Recursion and Iterators with Factorial numbers and Fibonacci Series---");
			System.out.println("1. Factorial using Iterators");
			System.out.println("2. Factorial using Recursion");
			System.out.println("3. Fibonacci Series using Iterators");
			System.out.println("4. Fibonacci Series using Recursion");
			System.out.print("Select an option: ");
			option=input.nextInt();	
		switch(option)
		{
		case 1:
			System.out.println("Factorial using Iterators");
			System.out.print("1. Type the number and you will get its factorial: ");
			varCase=input.nextInt();
			System.out.println("The factorial is: "+factorialUsingIterators(varCase));
			break;
		case 2:
			System.out.println("Factorial using Recursion");
			System.out.print("2. Type the number and you will get its factorial: ");
			varCase=input.nextInt();
			System.out.println(factorialUsingRecursion(varCase));
			break;
		case 3:
			System.out.println("Fibonacci Series using Iterators");
			System.out.print("Type the quantity of numbers you want to get from the Fibonacci Series: ");
			varCase=input.nextInt();
			System.out.println(fibonacciUsingIterators(varCase));
			break;
		case 4:
			System.out.println("Fibonacci Series using Recursion");
			System.out.print("Type the quantity of numbers you want to get from the Fibonacci Series: ");
			varCase=input.nextInt();
			System.out.print("The sum of the last two numbers is: ");
			System.out.print(fibonacciUsingRecursion(varCase));
			System.out.println("");
			break;
		default:
			System.out.println("You have to type a valid option");
		}
		}while(option<=4);
	}

	private static int factorialUsingIterators(int nEntrada) {
		int acum=1;
		for(int i=nEntrada;i>0;i--)
		{
			acum=i*acum;
		}
		return acum;
	}
	
	private static int factorialUsingRecursion(int n) {
		if(n==0)
		{
			return 1;
		}else {
			return n*factorialUsingRecursion(n-1);
		}
	}
	
	private static int fibonacciUsingIterators(int n) {
		int sum, t1 = 0, t2 = 1;
        System.out.print("First "+n+" terms: ");

        for (int i = 1; i < n; i++)
        {
            System.out.print(t1+" + ");
            sum=t1+t2;//the sum of t1+t2 (two previous numbers) 
            t1=t2;//we send t2 value -> t1 (t1 is the only value that we show on the screen )
            t2=sum;//we move the acumulated sum to t2,
        }
        return t1;
	}
	
	private static int fibonacciUsingRecursion(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibonacciUsingRecursion(n-1)+fibonacciUsingRecursion(n-2);
	}

}
