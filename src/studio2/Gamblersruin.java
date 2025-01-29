package studio2;

import java.util.Scanner;

public class Gamblersruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double gamble = 0;
		int money = 2;
		System.out.println("To start you have " + money + " dollars now.");
		while (money > 0 && money < 10) {
			gamble = Math.random( )*100;
			boolean win = gamble < 51;
			if (win == true){
				money = money + 1;
				System.out.println("You won! You have " + money + " dollars now.");
			}
			else {
				money = money - 1;
				System.out.println("You lost. You have " + money + " dollars now.");

			}
		}
		if (money == 10) {
			System.out.println("Success");
		}
		if (money == 0) {
			System.out.println("Failure");
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