package main;

import java.util.Scanner;

public class Exercises_Topic04_Aula14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Product code: ");
		int code = sc.nextInt();
		System.out.print("Quantity purchased: ");
		int purchased = sc.nextInt();
		
		if (code == 1) {
			double price = 5.00;
			System.out.println("Value that should be payed: $ " + purchased*price);
		}
		else if (code == 2) {
			double price = 3.50;
			System.out.println("Value that should be payed: $ " + purchased*price);
		}
		else if (code == 3) {
			double price = 4.80;
			System.out.println("Value that should be payed: $ " + purchased*price);
		}
		else if (code == 4) {
			double price = 8.90;
			System.out.println("Value that should be payed: $ " + purchased*price);
		}
		else {
			double price = 7.32;
			System.out.println("Value that should be payed: $ " + purchased*price);
		}
		
		sc.close();

	}

}
