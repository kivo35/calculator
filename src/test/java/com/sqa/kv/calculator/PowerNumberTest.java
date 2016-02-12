package com.sqa.kv.calculator;

import org.junit.Assert;
import org.junit.Test;

public class PowerNumberTest
{
	int result;

	@Test
	public void negativeNumberNegativePowerTest()
	{
		this.result = Calculator.powerNumber(-2, -2);
		Assert.assertEquals(0, this.result, 0);
	}

	@Test
	public void negativeNumberPositivePowerTest()
	{
		this.result = Calculator.powerNumber(-23, 3);
		Assert.assertEquals(-12167, this.result, 0);
	}

	@Test
	public void positiveNumberNegativePowerTest()
	{
		this.result = Calculator.powerNumber(1, -1);
		Assert.assertEquals(1, this.result, 0);
	}

	@Test
	public void powerNumberTest()
	{
		this.result = Calculator.powerNumber(3, 6);
		Assert.assertEquals(729, this.result);
	}

	@Test
	public void powerOneTest()
	{
		this.result = Calculator.powerNumber(100, 1);
		Assert.assertEquals(100, this.result);
	}

	@Test
	public void powerZeroTest()
	{
		this.result = Calculator.powerNumber(9999, 0);
		Assert.assertEquals(1, this.result);
	}
}
