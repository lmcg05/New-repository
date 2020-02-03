package com.qa.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InteractionTest {
	@Test
	public void greetingTest() {
		Interaction interaction = new Interaction(); // create an instance of interaction. (XCALLING THE GREETING)
		//Interaction.greeting().equals("Hi Friend"); this is a boolean hence we insert assert eqauls. 
		assertEquals("Hi Friend", interaction.greeting());  //the statement should be the same as the interaction
		
		// when there is a comparison error it would come up with red.
		// assertEquals: Assert.assertEquals() methods checks that the two objects are equals or not. If they are not, an AssertionError without a message is thrown. 
		////assert will throw in error if the two methods are wrong.
		
		//UNIT TESTING : TESTING EACH METHOD. 
		//The purpose is to validate that each unit of the software performs as designed. --->
		//A unit is the smallest testable part of any software. It usually has one or a few inputs and usually a single output.
	}
	
}
