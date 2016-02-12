package com.sqa.kv.calculator;

import org.junit.Assert;
import org.junit.Test;

public class GetTotalTest
{
	int result;
	Calculator total = new Calculator(10, 2, 0, -19);
	Calculator totalZero = new Calculator();

	@Test
	public void getTotalTest()
	{
		this.result = this.total.getTotal();
		Assert.assertEquals(-7, this.result);
	}

	@Test
	public void getTotalZeroTest()
	{
		this.result = this.totalZero.getTotal();
		Assert.assertEquals(0, this.result);
	}

}
