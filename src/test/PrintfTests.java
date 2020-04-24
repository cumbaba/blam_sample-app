package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import samples.Printf;

class PrintfTests {

	@Test
	void test() {
		Assert.assertEquals(Printf.prinntf("me"), "printedfme");
	}

}
