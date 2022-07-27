package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_Topic06_Aula17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people? ");
		int n = sc.nextInt();
		System.out.println("");
		
		String name[] = new String[n];
		double grade1[] = new double[n];
		double grade2[] = new double[n];
		
		for (int i=0;i<n;++i) {
			System.out.println("Data of student #" + (i+1) + " (Name/Grade1/Grade2):");
			name[i] = sc.next() + " " + sc.next();
			sc.nextLine();
			grade1[i] = sc.nextDouble();
			grade2[i] = sc.nextDouble();
		}
		
		double average[] = new double[n];
		for (int i=0;i<n;++i) {
			average[i] = (grade1[i] + grade2[i])/2;
		}
		
		System.out.println("Approved students: ");
		for (int i=0;i<n;++i) {
			if (average[i]>=6) {
				System.out.println(name[i]);
			}
		}
		
		
		
		sc.close();

	}

}
