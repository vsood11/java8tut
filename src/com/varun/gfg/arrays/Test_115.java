package com.varun.gfg.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class Test_115 {

	@Test
	public void distinctEle_NotNullInp_Success() {
		int[] inp = {1,1,1,1,2,3,4};
		Set<Integer> expectedOp = new HashSet<>(Arrays.asList(1,2,3,4));
		_2_1_DistEle_115 test = new _2_1_DistEle_115();

		Assert.assertEquals(expectedOp, test.distinctEle(inp));
	}
}
