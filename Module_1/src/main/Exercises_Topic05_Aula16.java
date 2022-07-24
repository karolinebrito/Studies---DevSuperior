package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double grade1, grade2;
		
		System.out.printf("Grade 1 = ");
		grade1 = sc.nextDouble();
		
		while (grade1<0 || grade1>10) {
			System.out.print("Invalid value. Enter again = ");
			grade1 = sc.nextDouble();
		}
		
		System.out.print("Grade 2 = ");
		grade2 = sc.nextDouble();
		
		while (grade2<0 || grade2>10) {
			System.out.print("Invalid value. Enter again = ");
			grade2 = sc.nextDouble();
		}
		
		System.out.printf("Average = %.2f", (grade1+grade2)/2);
		
		
		sc.close();

	}

}
