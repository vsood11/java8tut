package com.varun.gfg.arrays;

import com.varun.gfg.arrays._2_1_MajorityEle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class Test_2 {

	private _2_1_MajorityEle majorityEle_2 = new _2_1_MajorityEle();
	private int[] elesHasMajority = new int[]{1,1,1,1,2};
	private int[] elesHasNoMajority = new int[]{1,2,3,4,5};

	@Test
	public void isPresent_NotNullArray_True() {
		Assert.assertEquals(true, majorityEle_2.isPresent(elesHasMajority));
		Assert.assertEquals(true, majorityEle_2.isPresent2(elesHasMajority));
		Assert.assertEquals(true, majorityEle_2.isPresent3(elesHasMajority));
	}

	@Test
	public void isPresent_NotNullArray_False() {
		Assert.assertEquals(false, majorityEle_2.isPresent(elesHasNoMajority));
		Assert.assertEquals(false, majorityEle_2.isPresent2(elesHasNoMajority));
		Assert.assertEquals(false, majorityEle_2.isPresent3(elesHasNoMajority));
	}
}
