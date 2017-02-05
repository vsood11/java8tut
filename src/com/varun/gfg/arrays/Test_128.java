package com.varun.gfg.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class Test_128 {

	@Test
	public void largestPairSum_ArraySizeGreaterThan2_Success() {
		int[] inp = new int[]{1,13,-2};
		int expectedSum = 14;
		Assert.assertEquals(expectedSum, new _2_1_LargestPairSum_128().sum(inp));
	}
}
