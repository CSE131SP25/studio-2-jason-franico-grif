package studio2;

import java.util.Scanner;

public class Gamblersruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double gamble = 0;
		int money = 2;
		int startamount = 2;
		double losses = 0;
		int wins = 0;
		int winlimit = 10;

		double winchance = 70;
		System.out.println("To start you have " + money + " dollars now.");
		double simulation = 0; 
		for (int i = 0; i < 500; i++) {
			simulation ++;
		while (money > 0 && money < winlimit) {
			gamble = Math.random( )*100;
			boolean win = gamble <= winchance;
			if (win == true){
				money = money + 1;

			}
			else {
				money = money - 1;;
			}
			}
			
		if (money == 10) {
			wins++;
		}
		if (money == 0) {
			losses++;
			
			
			
		}
		money = 2;
		System.out.println("Simulation " + i + ":" );
		System.out.println(wins + " wins");
		System.out.println(losses + " losses");

		}
		System.out.println("Total simulations " + simulation + ":" );
		System.out.println(wins + " total wins");
		System.out.println(losses + " total losses");
		double actualruinrate = losses/simulation;
		System.out.println("Ruin rate: " + actualruinrate );
		if (winchance == 50) {
			double ruinrate = (1-(startamount/winlimit));
			System.out.println("Expected ruin rate: " + ruinrate );
		}
		else {
			double a = ((1-(winchance/100))/(winchance/100));
			double ruinrate = ((Math.pow(a,startamount) - Math.pow(a,winlimit))/ (1-Math.pow(a,winlimit)));
			System.out.println("Expected ruin rate: " + ruinrate );
		}
	}	
	
}
/*
startAmount

The amount of money that you start with

winChance

The win probability, or the probability that you win a single play

winLimit

If you reach this amount of money you had a successful day and leave

startAmount

2

winChance

.7

winLimit

10

totalSimulations

500

Example Output
Simulation 1: 16 LOSE

Simulation 2: 10 WIN

Simulation 3: 6 LOSE

Simulation 4: 8 WIN

...

Simulation 499: 28 WIN

Simulation 500: 18 WIN

Losses: 90 Simulations: 500

Ruin Rate from Simulation: 0.18 Expected Ruin Rate: 0.18350278772959913


*/