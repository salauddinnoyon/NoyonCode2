package com.bit.test;

import org.junit.Test;

public class SmokeTest extends BaseTest {
	
	ScenarioTest sceTest ;
	@Test
	public void run_Kids_Shoes_Page() {
		
		sceTest = new ScenarioTest(dr);
		sceTest.verify_kids_Shoes_Page();
		
	}

}
