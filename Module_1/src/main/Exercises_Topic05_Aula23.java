package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many cases = ");
		int n = sc.nextInt();
		System.out.println("");
		
		for (int i=1; i<=n; ++i) {
			System.out.print("Numerator = ");
			double numerator = sc.nextDouble();
			System.out.print("Denominator = ");
			double denominator = sc.nextDouble();
			if (denominator!=0) {
				System.out.printf("Division = %.2f\n", numerator/denominator);
				System.out.println("");
			}
			else {
				System.out.println("Impossible to calculate.\n");
			}
		}
		
		sc.close();

	}

}
