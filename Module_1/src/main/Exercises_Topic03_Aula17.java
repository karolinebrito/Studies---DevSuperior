package main;

import java.util.Scanner;

public class Exercises_Topic03_Aula17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Circle radius: ");
		double radius = sc.nextDouble();
		System.out.printf("Circle area: " + String.format("%.2f", Math.PI*Math.pow(radius, 2)));
		
		sc.close();

	}

}
