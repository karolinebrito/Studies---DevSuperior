package main;

import java.util.Scanner;

class ClassifyIMC{
	public static String func(double weight, double height) {
		double IMC = weight/Math.pow(height, 2);
		if (IMC<=20) {
			return "UNDER WEIGHT";
		}
		else if(IMC>20 && IMC<=25) {
			return "NORMAL WEIGHT";
		}
		else if(IMC>25 && IMC>=30) {
			return "OVERWEIGHT";
		}
		else {
			return "OBESE";
		}
	}
}

public class Exercises_Topic08_Aula21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the weight: ");
		double weight = sc.nextDouble();
		System.out.print("Enter the height: ");
		double height = sc.nextDouble();
		System.out.println("RESUL of IMC: " + ClassifyIMC.func(weight, height));
		
		sc.close();

	}

}
