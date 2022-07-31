package main;

import java.util.Scanner;

class realToDollar{
	public static double func(double dollarQuote, double amountOfReais) {
		return amountOfReais/dollarQuote;
	}
}

public class Exercises_Topic08_Aula16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the dollar quote: ");
		double dollarQuote = sc.nextDouble();
		System.out.print("Enter the amount in reais: ");
		double amountOfReais = sc.nextDouble();
		
		System.out.println("You can buy " + String.format("%.2f", realToDollar.func(dollarQuote, amountOfReais)) + " dollars");
		
		sc.close();

	}

}
