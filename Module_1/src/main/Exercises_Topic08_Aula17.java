package main;

import java.util.Scanner;

class DiagonalRectangle{
	public static double func(double base, double height) {
		return Math.sqrt((Math.pow(base, 2))+(Math.pow(height, 2)));	
	}
}

class AreaRectangle{
	public static double func(double base, double height) {
		return base*height;
	}
}

class PerimeterRectangle{
	public static double func(double base, double height) {
		return 2*(base+height);
	}
}

public class Exercises_Topic08_Aula17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base of the rectangle: ");
		double base = sc.nextDouble();
		System.out.print("Enter the height of the rectangle: ");
		double height = sc.nextDouble();
		
		System.out.println("Area = " + String.format("%.2f", DiagonalRectangle.func(base,height)));
		System.out.println("Area = " + String.format("%.2f", AreaRectangle.func(base,height)));
		System.out.println("Area = " + String.format("%.2f", PerimeterRectangle.func(base,height)));
		
		
		sc.close();

	}

}
