package main;

import java.util.Scanner;

public class Exercises_Topic03_Aula10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the width: ");
		double width = sc.nextDouble();
		System.out.print("Enter the length: ");
		double length = sc.nextDouble();
		System.out.print("Enter the price: ");
		double price = sc.nextDouble();
		double area = width*length;
		System.out.println("");
		System.out.printf("Area = %.2f\n", area);
		System.out.printf("Price of the ground = %.2f\n", area*price);
		
		sc.close();

	}

}
