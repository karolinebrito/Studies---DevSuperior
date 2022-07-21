package main;

import java.util.Scanner;

public class Exercises_Topic03_Aula19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Travelled distance: ");
		double travelledDistance = sc.nextDouble();
		System.out.print("Spent fuel: ");
		double spentFuel = sc.nextDouble();
		System.out.print("Average consumption = " + String.format("%.2f", travelledDistance/spentFuel));
		
		sc.close();

	}

}
