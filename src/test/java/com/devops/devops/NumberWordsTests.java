package com.devops.devops;

import org.junit.*;

import com.devops.devops.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals("one", numberWords.toWords( 1 ) ) ;
		//Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	@Test(expected=NumberFormatException.class)
	public void numberOutOfRangeReturnsError1() {
		//Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( 1 ) ) ;
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}

}
