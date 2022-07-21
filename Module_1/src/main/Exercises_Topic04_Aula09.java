package main;

import java.util.Scanner;

public class Exercises_Topic04_Aula09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Minutes: ");
		int minutes = sc.nextInt();
		double franchiseValue = 50;
		double extraValue = 2;
		
		if (minutes <= 100) {
			System.out.println("Value that should be payed: " + String.format("%.2f", franchiseValue));
		}
		else {
			System.out.println("Value that should be payed: " + String.format("%.2f", (franchiseValue + (minutes-100)*extraValue)));
		}
		
		sc.close();

	}

}
