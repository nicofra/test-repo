package com.test.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
	
	@Test
	public void helloWorldTest() {

		assertEquals("Hello Worl", HelloWorld.print());
		
	}
	
}
		