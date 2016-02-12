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
public class MultNumbersTest
{
	int result;

	@Test
	public void MultByZeroTest()
	{
		this.result = Calculator.multNumbers(12, 32, -3, 1, 99, 0);
		Assert.assertEquals(0, this.result);
	}

	@Test
	public void MultNegativeNumbersTest()
	{
		this.result = Calculator.multNumbers(12, 32, -3);
		Assert.assertEquals(-1152, this.result);
	}

	@Test
	public void MultPositiveNumbersTest()
	{
		this.result = Calculator.multNumbers(1, 2, 3);
		Assert.assertEquals(6, this.result);
	}
}
