/**
 * 
 */
package com.sqa.kv.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Kirill
 * 
 */
public class DivideNumbersTest
{
	int result;

	@Test(expected = java.lang.ArithmeticException.class)
	public void divideByZeroTest()
	{
		Calculator.divideNumbers(1.0, 0.0);
	}

	@Test
	public void divideDoublesTest()
	{
		this.result = Calculator.divideNumbers(25.0, 2.0);
		Assert.assertEquals(12, this.result, 0);
	}

	@Test
	public void divideIntsTest()
	{
		this.result = Calculator.divideNumbers(10, 2);
		Assert.assertEquals(5, this.result, 0);
	}

	@Test
	public void ZeroDivideByTest()
	{
		this.result = Calculator.divideNumbers(0, 193.33);
		Assert.assertEquals(0, this.result);
	}
}
