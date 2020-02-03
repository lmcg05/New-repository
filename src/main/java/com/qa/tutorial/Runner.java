package com.qa.tutorial;
////////////////////////////////////////////////////////////////////////MAVEN////////////////////////////////////////////////////////////////////////////////////
public class Runner {
	public static void main(String[]args) {
		Interaction potato =new Interaction();   // inside the main() creating an instance of Runner would allow information of insult and greetings to be accessed 
		System.out.println(potato.greeting() + " " + potato.insult());     
		
			
		}
}
// can have the method form another class as long as it is refferred.