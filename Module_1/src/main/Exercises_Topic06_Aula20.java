package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_Topic06_Aula20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of people = ");
		int n = sc.nextInt();
		String name[] = new String[n];
		double grade1[] = new double[n];
		double grade2[] = new double[n];
		System.out.println("");
		
		for (int i=0; i<n; ++i) {
			System.out.println("Person # " + (i+1) + ": ");
			System.out.print("Name: ");
			name[i] = sc.next() + " " + sc.next();
			System.out.print("Grade 1: ");
			grade1[i] = sc.nextDouble();
			System.out.print("Grade 2: ");
			grade2[i] = sc.nextDouble();
			System.out.println("");
		}
		System.out.println("");
		
		double average[] = new double[n];
		for (int i=0; i<n; ++i) {
			average[i] = (grade1[i] + grade2[i])/2;
		}
		System.out.println("");
		
		System.out.println("TABLE: ");
		for (int i=0; i<n; ++i) {
			System.out.println(name[i] + ", " + grade1[i] + ", " + grade2[i] + ", " + "AVERAGE = " + average[i]);
		}
		System.out.println("");
		
		System.out.println("APPROVED PEOPLE: ");
		int sum = 0;
		double total = 0;
		for (int i=0; i<n; ++i) {
			if (average[i]>=70) {
			System.out.println(name[i]);
			sum += 1;
			total += average[i];
			}
		}
		System.out.println("");
		
		System.out.println("Percentage of Approval: " + ((double)sum)/((double) n)*100.00 + "%");
		
		double tempAverage[] = new double[n];
		tempAverage = Arrays.copyOf(average, n);
		Arrays.sort(tempAverage);
		double value = tempAverage[tempAverage.length-1];
		for (int i=0; i<n; ++i) {
			if (average[i]==value) {
				System.out.println("Highest grade: " + name[i]);
			}
		}	
		
		if (sum==0) {
			System.out.println("There is no approved candidates");
		}
		else {
			System.out.println("Average grade between approved people: " +  String.format("%.2f", total/((double) sum)));		
		}
		
		
		sc.close();

	}

}
