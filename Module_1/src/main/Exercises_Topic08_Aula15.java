package main;

import java.util.Scanner;

class Installment {
	public static double func(double total, double downPayment, int months) {
		return (total-downPayment)/months;
	}
}

public class Exercises_Topic08_Aula15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Total value of the property: ");
		double total = sc.nextDouble();
		System.out.print("Down payment: ");
		double downPayment = sc.nextDouble();
		System.out.print("How many months will be financed? ");
		int months = sc.nextInt();
		
		System.out.println("Value of each installment: " + String.format("%.2f", Installment.func(total, downPayment, months)));
		
		sc.close();

	}

}
