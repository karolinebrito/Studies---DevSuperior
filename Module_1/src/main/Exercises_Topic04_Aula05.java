package main;

import java.util.Scanner;

public class Exercises_Topic04_Aula05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First grade: ");
		double firstGrade = sc.nextDouble();
		System.out.print("Second grade: ");
		double secondGrade = sc.nextDouble();
		
		double finalGrade = firstGrade + secondGrade;
		
		System.out.printf("Final Grade = %.2f\n", finalGrade);
		
		if (finalGrade >= 60) {
			System.out.print("Approved!");
		}
		else {
			System.out.println("Failed!");
		}
		
		sc.close();

	}

}
