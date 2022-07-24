package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Age = ");
		int age = sc.nextInt();
		double sum = 0;
		int i = 0;

		if (age < 0) {
			System.out.println("Impossible to calculate.");
		} 
		else {
			while (age > 0) {
				sum = sum + age;
				i = i + 1;
				System.out.print("Age = ");
				age = sc.nextInt();
			}
			System.out.printf("Average = %.2f", sum / i);
		}

		sc.close();

	}

}
