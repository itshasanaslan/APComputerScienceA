package helloapagain;

import java.util.Scanner;

public class GameManager {

	int max;
    int min;					// 50.0
    int random;
	int score;
	// constructor
	public GameManager(int minimumRange, int maximumRange) {
		max = maximumRange;
		min = minimumRange;
		System.out.println("Welcome to the game manager!");
		randomize();
	}
	
	
	public void playNumberGuesser( ) {
	
        	Scanner sc = new Scanner(System.in);
    	 	
            System.out.print("enter a number: ");
            int x = sc.nextInt();
            
            if (random == x ){
            	
            	guessedCorrectly();

            	
            } else if (random<x){
              System.out.println("Too high!");
            } else if (random>x){
              System.out.println("Too low!");
            }
	}
	
	public void randomize() {
		System.out.println("Random number is changed.");
		random = (int) (Math.random()*(max * min + 1))+min; // 
	}
	
	public void guessedCorrectly() {
		System.out.println("Correct!");
        score++;
      	System.out.println("The random is: " + random);
    	max *= 2;
      	randomize();
	}
	
}
