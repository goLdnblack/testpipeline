/*
 In current or new class design multiple fib numbers
 to display the run time for each sequence for both
 recursive and iterative solutions.

 Jesus Sanchez-Rivera
 CEN3024
 Professor Walauskis
 10/03/2022
*/


package com.testpipeline;

import java.util.Arrays;

public class Fibonacci
{
	private Fibonacci() {}

	// Testing purposes 2/28/2023
	static long startTime = 0;
	static long endTime = 0;
	static long totalTime = 0;

	public static long iterativeMethod(int n)
	{
		long fibResult = 0;
		//int x;
		// Iterative

		System.out.println("Iterative Method\n");
		ProgramTimer.start();
		fibResult = FibonacciIterative.fib(n);

		/* 
		for (x = 0; x <= n; x++)
		{
			System.out.println("Solving for fib(" + x + ")");
			System.out.print("F(" + x + ") = ");
			ProgramTimer.start();
			fibResult = FibonacciIterative.fib(x);
			System.out.print(fibResult + " ");
			ProgramTimer.end();
			System.out.println();

		}

		*/

		ProgramTimer.end();
		totalTime = ProgramTimer.duration.getNano();

		return fibResult;
	}

	public static long recursiveMethod(int n)
	{
		//int x;
		long fibResult = 0;

		// Recursive
		System.out.println("\nRecursive Method\n");

		ProgramTimer.start();
		fibResult = FibonacciRecursive.fib(n);
		/* 
		for (x = 0; x <= n; x++)
		{
			System.out.println("Solving for fib(" + x + ")");
			System.out.print("F(" + x + ") = ");
			ProgramTimer.start();
			fibResult = FibonacciRecursive.fib(x);
			System.out.print(fibResult + " ");
			ProgramTimer.end();
			System.out.println();

		}
		*/

		ProgramTimer.end();
		totalTime = ProgramTimer.duration.getNano();
		
		return fibResult;
	}


	public static void iterativeVsRecursive(int n)
	{
		// Calculate the Fibonacci sequence up to
		// the value n and display the time it took
		// for each method.
		long fibResult = 0;
		int x;
		// Iterative
		System.out.println("Iterative Method\n");

		for (x = 0; x <= n; x++)
		{
			System.out.println("Solving for fib(" + x + ")");
			System.out.print("F(" + x + ") = ");
			ProgramTimer.start();
			fibResult = FibonacciIterative.fib(x);
			System.out.print(fibResult + " ");
			ProgramTimer.end();
			System.out.println();

		}

		// Recursive
		System.out.println("\nRecursive Method\n");
		for (x = 0; x <= n; x++)
		{
			System.out.println("Solving for fib(" + x + ")");
			System.out.print("F(" + x + ") = ");
			ProgramTimer.start();
			startTime = System.nanoTime();
			fibResult = FibonacciRecursive.fib(x);
			System.out.print(fibResult + " ");
			ProgramTimer.end();
			System.out.println();

		}
	}

	public static long recursiveMemoization(int n)
	{
		// Compare the time difference of recursion
		// using memoization versus regular recursion.
		long fibResult = 0;
		//int x;

		// Recursive Memoization method
		System.out.println("Recursive Memoization Method\n");

		ProgramTimer.start();
		long[] memo = new long[n + 2];
		Arrays.fill(memo, -1);
		fibResult = FibonacciDP.fib(n, memo);
		/* 

		for (x = 0; x <= n; x++)
		{
			long[] memo = new long[n + 2];
			Arrays.fill(memo, -1);
			System.out.println("Solving for fib(" + x + ")");
			System.out.print("F(" + x + ") = ");
			
			fibResult = FibonacciDP.fib(x, memo);
			System.out.println("value: " + FibonacciDP.fib(x, memo));
			System.out.print(fibResult + " ");
			
			System.out.println();

		}
		*/

		ProgramTimer.end();
		totalTime = ProgramTimer.duration.getNano();

		return fibResult;
	}

	public static void main(String[] args)
	{
		// Test for fib(40)


		System.out.println(iterativeMethod(40));
		System.out.println(recursiveMethod(40) + "\n");
		System.out.println(recursiveMemoization(40));
	}
}
