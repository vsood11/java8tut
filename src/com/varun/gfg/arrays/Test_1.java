package com.varun.gfg.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by Varun_Sudan on 1/25/2017.
 */
public class Test_1 {

	private _2_3_SumOfArrayToX_1 test = new _2_3_SumOfArrayToX_1();;
	private int sumIsPresent = 5;
	private int sumIsNotPresent = 20;
	private int[] eles = new int[]{1,2,3,4,5,6};
	boolean expectedTrue = true;
	boolean expectedFalse = false;

	@Test
	public void checkSum1_SumIsPresent_True() {
		assertEquals(expectedTrue, test.checkSum1(eles, sumIsPresent));
	}


	@Test
	public void checkSum2_SumIsPresent_True() {
		assertEquals(expectedTrue, test.checkSum2(eles, sumIsPresent));
	}


	@Test
	public void checkSum3_SumIsPresent_True() {
		assertEquals(expectedTrue, test.checkSum3(eles, sumIsPresent));
	}

	@Test
	public void checkSum1_SumIsNotPresent_False() {
		assertEquals(expectedFalse, test.checkSum1(eles, sumIsNotPresent));
	}


	@Test
	public void checkSum2_SumIsNotPresent_False() {
		assertEquals(expectedFalse, test.checkSum2(eles, sumIsNotPresent));
	}


	@Test
	public void checkSum3_SumIsNotPresent_False() {
		assertEquals(expectedFalse, test.checkSum3(eles, sumIsNotPresent));
	}
}
