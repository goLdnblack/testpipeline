package com.testpipeline;

import java.time.Duration;

class ProgramTimer
{
	static long startTime;
	static long endTime;
	static long totalTime;

	static Duration duration;

	public static void start()
	{
		startTime = System.nanoTime();
	}

	public static void end()
	{
		// When end is called, it should print
		// the calculation of the time spent
		endTime = System.nanoTime();
		calcTime();
	}

	private static void calcTime()
	{
		// Print the result
		totalTime = endTime - startTime;
		duration = Duration.ofNanos(System.nanoTime() - startTime);
		System.out.println("Program execution time: " + 
			duration.getNano() + " nanoseconds.");
					
		//System.out.println("Program execution time: " +
		//					totalTime + " nanoseconds.");
	}
}
