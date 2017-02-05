package com.varun.gfg.arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class Test_3 {

	@Test
	public void numOfOddTimes_NumOddTimesPresent_1() {
		int[] inp = new int[] {1,2,2,3,3,1,1};
		_2_1_NumOddTimes cls = new _2_1_NumOddTimes();
		Assert.assertEquals(1, cls.isPresent(inp));
	}

	@Test
	public void numOfOddTimes_NumOddNotTimesPresent_0() {
		int[] inp = new int[] {1,2,2,3,3,1};
		_2_1_NumOddTimes cls = new _2_1_NumOddTimes();
		Assert.assertEquals(0, cls.isPresent(inp));
	}
}
