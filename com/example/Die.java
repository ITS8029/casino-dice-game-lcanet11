
package com.example;



import java.util.Random;



public class Die {

	public int numberOfSides = 6;

	

	public int roll() {

		//Return a random number between 1 and numberOfSides

		Random myRandom = new Random();

		

		return myRandom.nextInt(numberOfSides) + 1; 

	}

}
