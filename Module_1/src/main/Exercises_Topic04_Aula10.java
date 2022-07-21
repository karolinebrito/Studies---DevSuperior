package main;

import java.util.Scanner;

public class Exercises_Topic04_Aula10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Price of a unit: ");
		double price = sc.nextDouble();
		System.out.print("Quantity purchased: ");
		int purchased = sc.nextInt();
		System.out.print("Total money: ");
		double totalMoney =sc.nextDouble();
		
		if (totalMoney>=price*purchased) {
			System.out.println("Charge = " + String.format("%.2f", totalMoney-price*purchased));
		}
		else {
			System.out.println("Not enough money. It is missing " + String.format("%.2f", price*purchased-totalMoney) + " $.");
		}
		
		
		sc.close();

	}

}
