package main;

import java.util.Scanner;

class Functions{
	public static double Taxes(double grossIncome) {
		if (grossIncome<=4000) {
			return 0.2*grossIncome;
		}
		else {
			return 0.25*grossIncome;
		}
	}
	public static double SocialSecurity(double grossIncome) {
		if (grossIncome<=1500) {
			return 0.1*grossIncome;
		}
		else {
			return 0.15*grossIncome;
		}
	}
	public static double NetIncome(double grossIncome) {
		return grossIncome - Taxes(grossIncome) - SocialSecurity(grossIncome);
	}	
}

public class Exercises_Topic08_Aula22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your gross income: ");
		double grossIncome = sc.nextDouble();
		
		double realIncome = Functions.NetIncome(grossIncome);
		System.out.println("Net income = $ " + realIncome);
		
		sc.close();

	}

}
