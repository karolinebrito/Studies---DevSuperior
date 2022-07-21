package main;

import java.util.Scanner;

public class Exercises_Topic04_Aula11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Measure of glucose: ");
		double glucose = sc.nextDouble();
		
		if (glucose <= 100 ) {
			System.out.print("Classification: normal");
		}
		else if (glucose >100 && glucose<=140) {
			System.out.print("Classification: high");
		}
		else {
			System.out.print("Classification: diabetes");
		}
		
		sc.close();

	}

}
