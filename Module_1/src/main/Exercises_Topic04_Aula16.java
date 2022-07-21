package main;

import java.util.Scanner;

public class Exercises_Topic04_Aula16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Actual Salary: ");
		double actual_salary = sc.nextDouble();
		
		if (actual_salary<=1000) {
			System.out.println("New salary: $" + String.format("%.2f", actual_salary*1.2));
			System.out.println("Salary increase: $" + String.format("%.2f", actual_salary*0.2));
			System.out.println("Percentage increase: 20%");
		}
		else if (actual_salary>1000 && actual_salary<=3000) {
			System.out.println("New salary: $" + String.format("%.2f", actual_salary*1.15));
			System.out.println("Salary increase: $" + String.format("%.2f", actual_salary*0.15));
			System.out.println("Percentage increase: 15%");
		}
		else if (actual_salary>3000 && actual_salary<=8000) {
			System.out.println("New salary: $" + String.format("%.2f", actual_salary*1.1));
			System.out.println("Salary increase: $" + String.format("%.2f", actual_salary*0.1));
			System.out.println("Percentage increase: 10%");
		}
		else {
			System.out.println("New salary: $" + String.format("%.2f", actual_salary*1.05));
			System.out.println("Salary increase: $" + String.format("%.2f", actual_salary*0.05));
			System.out.println("Percentage increase: 5%");
		}
		
		sc.close();

	}

}
