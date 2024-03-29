package main;

import java.util.Scanner;

public class Exercises_Topic03_Aula13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Number of persons: ");
		int number = sc.nextInt();
		System.out.println("");
		
		int age[] = new int[number];
		String name[] = new String[number];
		
		double totalAge = 0;
	
		for (int i = 0;i < number; i++) {
			System.out.printf("Data of person %d ", i+1);
			System.out.println();
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
			System.out.printf("The age of %s is %d.\n\n", name[i], age[i]);
			totalAge = totalAge + age[i];
		}
		
		System.out.printf("The average age of %s and %s is %.2f.\n", name[0], name[1], totalAge/number);
		
		sc.close();

	}

}
