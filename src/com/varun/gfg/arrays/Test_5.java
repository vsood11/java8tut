package com.varun.gfg.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class Test_5 {

	@Test
	public void missingEle_ValidInp_Success() {
		int[] inp = new int[] {1,2,3,5,6};
		int expectedOp = 4;
		Assert.assertEquals(expectedOp, new _2_1_MissingNum_5().value(1, 6, inp));
	}
}
