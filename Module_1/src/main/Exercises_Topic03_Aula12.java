package main;

import java.util.Scanner;

public class Exercises_Topic03_Aula12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base = ");
		double base = sc.nextDouble();
		System.out.print("Heigth = ");
		double heigth = sc.nextDouble();
		double area = base*heigth;
		System.out.printf("Area = %.2f\n", area);
		double perimeter = 2*(base+heigth);
		System.out.printf("Perimeter = %.2f\n", perimeter);
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(heigth,2));
		System.out.printf("Diagonal = %.2f\n", diagonal);		
		
		sc.close();

	}

}
