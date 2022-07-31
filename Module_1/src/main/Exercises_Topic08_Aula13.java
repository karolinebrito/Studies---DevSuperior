package main;

import java.util.Scanner;

class Func{	
	public static double IMC(double weight, double height) {
		double IMC = weight/Math.pow(height, 2);
		return IMC;
	}
	
}

public class Exercises_Topic08_Aula13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the weight of the person: ");
		double weight = sc.nextDouble();
		System.out.print("Enter the height of the person: ");
		double height = sc.nextDouble();
		
		System.out.println("IMC = " + String.format("%.2f", Func.IMC(weight, height)));
		
		sc.close();	
		
	}

}



