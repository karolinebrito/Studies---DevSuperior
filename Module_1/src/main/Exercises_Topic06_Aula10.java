package main;

import java.util.Scanner;

public class Exercises_Topic06_Aula10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Number of people: ");
		int n = sc.nextInt();
		System.out.println("");
		
		String name[] = new String[n];
		int age[] = new int[n];
		double height[] = new double[n];
		
		for (int i=0;i<n;++i) {
			System.out.printf("Person # %d",(i+1));
			System.out.println("");
			System.out.print("Name: ");
			name[i] = sc.next();
			sc.nextLine();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
			System.out.print("Height: ");
			height[i] = sc.nextDouble();
			System.out.println("");
		}
		
		double sumHeight = 0;
		for (int i=0;i<n;++i) {
			sumHeight += height[i];
		}
		System.out.printf("Average Height: %.2f", sumHeight/n);
		System.out.println("");
		
		int lowerThan16 = 0;
		for (int i=0;i<n;++i) {
			if (age[i]<16){
				lowerThan16 += 1;
			}
		}
		System.out.println("People with less than 16 years: " + String.format("%.2f", ((double) lowerThan16/n)*100) + "%");
		
		for (int i=0;i<n;++i) {
			if (age[i]<16){
				System.out.println(name[i]);
			}
		}
		
		sc.close();

	}

}
