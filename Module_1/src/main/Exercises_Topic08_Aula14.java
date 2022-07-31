package main;

import java.util.Scanner;

class fahrenheitToCelsius{	
	public static double tempC(double tempF) {
		return (double) 5/9*(tempF-32);
	}
	
}

public class Exercises_Topic08_Aula14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit: ");
		double tempF = sc.nextDouble();
		
		System.out.println("Temperature in Celcius = " + String.format("%.2f", fahrenheitToCelsius.tempC(tempF)));
		
		sc.close();

	}

}
