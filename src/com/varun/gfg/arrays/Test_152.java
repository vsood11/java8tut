package com.varun.gfg.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class Test_152 {

	@Test
	public void lostEle_ValidInp_Success() {
		_2_1_LostEleFromDup_152 test = new _2_1_LostEleFromDup_152();
		int[] inp =  new int[]{1,2,3,4,5};
		int[] dup = new int[]{4,1,3,2};

		int expectedResult = 5;

		Assert.assertEquals(expectedResult, test.lostEle(dup,inp));
	}
}
