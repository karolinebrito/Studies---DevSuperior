package main;

import java.util.Scanner;

public class Exercises_Topic03_Aula18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Worked hours: ");
		int worked_hours = sc.nextInt();
		System.out.print("Value per hour: ");
		double valuePerHour = sc.nextDouble();
		System.out.print("The payment for " + name + " should be " + String.format("%.2f", valuePerHour*worked_hours));
		
		sc.close();

	}

}
