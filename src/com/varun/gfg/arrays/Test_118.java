package com.varun.gfg.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class Test_118 {

	@Test
	public void firstRepeatingEle_ValidInp_Success() {
		_2_1_FirstRepeatingEle_118 test = new _2_1_FirstRepeatingEle_118();
		int[] inp = {10, 5, 3, 4, 3, 5, 6};
		int expectedOp = 5;

		Assert.assertEquals(expectedOp, test.find(inp));
	}
}
