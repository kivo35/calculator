/**
 * 
 */
package com.sqa.kv.calculator;

/**
 * @author Kirill
 * 
 */
public class Calculator
{
	public static int divideNumbers(double num1, double num2)
	{
		double total = 0.0;
		try
		{
			total = num1 / num2;
			if (total == Double.POSITIVE_INFINITY || total == Double.NEGATIVE_INFINITY)
			{
				throw new ArithmeticException();
			}
			return (int) total;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Can't divide by 0!");
		}
		return 0;
	}

	public static int multNumbers(int... nums)
	{
		int total = 1;
		for (int i = 0; i < nums.length; i++)
		{
			total *= nums[i];
		}
		return total;
	}

	public static int powerNumber(int number, int power)
	{
		int total;
		total = (int) Math.pow(number, power);
		return total;
	}

	int[] numbers;

	public Calculator(int... num)
	{
		this.numbers = num;
	}

	public int getTotal()
	{
		int total = 0;
		for (int num : this.numbers)
		{
			total += num;
		}
		return total;
	}
}
