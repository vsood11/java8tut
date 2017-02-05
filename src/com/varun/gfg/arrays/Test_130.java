package com.varun.gfg.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class Test_130 {

	@Test
	public void pythogarasTriplet_ValidInput_Success() {
		_2_1_Pyth_130 test = new _2_1_Pyth_130();
		boolean expectedResult = true;
		int[] inp = new int[]{5,2,3,4,1};
		Assert.assertEquals(expectedResult, test.pythTriplet(inp));
	}
}
