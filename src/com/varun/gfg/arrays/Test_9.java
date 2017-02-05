package com.varun.gfg.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class Test_9 {

	@Test
	public void reverseArray_ValidInput_Success() {
		_2_1_ReverseArray_9 rev = new _2_1_ReverseArray_9();
		int[] inp = new int[]{1,2,3,4,5};
		int[] expectedOp = new int[]{5,4,3,2,1};
		inp = rev.reverse(inp);

		for(int i = 0; i < expectedOp.length; i++) {
			if(expectedOp[i] !=  inp[i]) {
				Assert.assertFalse(true);
			}
		}
	}
}
