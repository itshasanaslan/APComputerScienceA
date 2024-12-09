package helloapagain;

import java.util.Scanner;


// RandomNumberManager manager = new Ram
public class RandomNumberManager {


 	int max =100;
    int min =1;					
    int random = (int) (Math.random() * (max - min + 1) + min);
	
	
	// constructor
	public RandomNumberManager () {
		System.out.println("Game object is created");
	}
	
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
        int x = sc.nextInt();
        
        if (random==x){
          System.out.println("Correct!");
        } else if (random<x){
          System.out.println("Too high!");
        } else if (random>x){
          System.out.println("Too low!");
        }

	System.out.println("The random was: " + random);
	}
	
	
}