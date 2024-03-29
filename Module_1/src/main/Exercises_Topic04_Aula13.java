package main;

import java.util.Scanner;

public class Exercises_Topic04_Aula13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose the scale (C/F): ");
		String scale = sc.nextLine();
		
		if (scale.equals("F")) {
			System.out.print("Temperature in F: ");
			double F = sc.nextDouble();
			System.out.println("Temperature in C: " + String.format("%.2f",5.0/9.0*(F-32)));
		}
		else {
			System.out.print("Temperature in C: ");
			double C = sc.nextDouble();
			System.out.println("Temperature in F: " + String.format("%.2f",C*9/5+32));
		}
		
		sc.close();

	}

}
