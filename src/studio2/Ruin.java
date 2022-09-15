package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		

		System.out.println("Start Amount: ");
		int startAmount = in.nextInt();
		System.out.println("Win Chance: ");
		double winChance = in.nextDouble();
		System.out.println("Win Limit: ");
		int winLimit = in.nextInt();
		int x = startAmount;
		int losses = 0;
		
		for (int totalSimulations = 1; totalSimulations<500; totalSimulations++) {
			int gamesPlayed = 0;
			startAmount = x;
			while (startAmount > 0 && startAmount < winLimit) {
				
				gamesPlayed++;

				if (Math.random() >= winChance) {
					startAmount--;
				} 
				else {
					startAmount++;
				}
				
			}
			
			if (startAmount > 0) {
				System.out.println("Simulation " + totalSimulations + ": " + gamesPlayed + " Win");
			} else {
				System.out.println("Simulation " + totalSimulations + ": " + gamesPlayed + " Lose");
				losses++;
			}
			
			
		}
		
		double expectedRuin;
		if (winChance == 0.5) {
			expectedRuin = 1-x/winLimit;
		} else {
			
		}
		
		System.out.println("Losses: "+ losses +" Simulations: " + 500);
		System.out.println("Ruin Rate from Simulation: " + (losses/500.0) + " Expected Ruin Rate: " + 1);
		
		
		
	}

}

