package main;

import java.util.Scanner;

public class Exercises_Topic03_Aula16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Price of one product: ");
		double price = sc.nextDouble();
		System.out.print("How many did you buy: ");
		int amount = sc.nextInt();
		System.out.print("Payment: ");
		double payment = sc.nextDouble();
		System.out.print("Change = " + String.format("%.2f", payment - price*amount));
		
		sc.close();
	}

}
