package main;

import java.util.Scanner;


public class Exercises_Topic03_Aula20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.print("a = ");
		a = sc.nextDouble();
		System.out.print("b = ");
		b = sc.nextDouble();
		System.out.print("c = ");
		c = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Area of a Square = " + String.format("%.2f", Math.pow(a, 2)));
		System.out.println("Area of a Triangle = " + String.format("%.2f", a*b/2));
		System.out.println("Area of a Trapeze = " + String.format("%.2f", (a+b)*c/2));
		
		sc.close();

	}

}
