package main;

import java.util.Scanner;

public class Exercises_Topic04_Aula06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a = ");
		double a = sc.nextDouble();
		System.out.print("b = ");
		double b = sc.nextDouble();
		System.out.print("c = ");
		double c = sc.nextDouble();
		
		double delta = Math.sqrt(Math.pow(b, 2)-4*a*c);
		System.out.println();
		double x1 = (-b + delta)/(2*a);
		double x2 = (-b - delta)/(2*a);
		
		if (Math.pow(b, 2)-4*a*c<0) {
			System.out.println("This equation has no roots.");
		}
		else {
			System.out.print("X1 = " + String.format("%.2f\n",x1));
			System.out.print("X2 = " + String.format("%.2f",x2));
		}
		
		sc.close();

	}

}
