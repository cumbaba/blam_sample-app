package tests;

import samples.Printf;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PrintfTests {

	@Test
	void test() {
		Assert.assertEquals(Printf.prinntf("me"), "printedfme");
	}

}
