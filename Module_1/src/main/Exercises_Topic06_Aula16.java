package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_Topic06_Aula16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people? ");
		int n = sc.nextInt();
		System.out.println("");
		
		String name[] = new String[n];
		int age[] = new int[n];
		
		for (int i=0;i<n;++i) {
			System.out.println("Data of the person #" + (i+1));
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
			System.out.println("");

		}
		
		int tempAge[] = Arrays.copyOf(age, n);
		Arrays.sort(tempAge);
		int value = tempAge[tempAge.length-1];
		
		for (int i=0;i<n;++i) {
			if (age[i]==value) {
				System.out.print("Oldest person: " + name[i]);
			}
		}
		
		sc.close();

	}

}
