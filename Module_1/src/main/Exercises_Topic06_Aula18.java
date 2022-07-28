package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_Topic06_Aula18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people? ");
		int n = sc.nextInt();
		System.out.println("");
		
		double height[] = new double[n];
		String gender[] = new String[n];
		
		for (int i=0;i<n;++i) {
			System.out.println("Person #" + (i+1));
			System.out.print("Height: ");
			height[i] = sc.nextDouble();
			System.out.print("Gender (M/F): ");
			gender[i] = sc.next();
			System.out.println("");
		}
		
		double tempHeight[] = Arrays.copyOf(height, n);
		Arrays.sort(tempHeight);
		System.out.println("Shorter height: " + tempHeight[0]);
		System.out.println("Greatest height: " + tempHeight[tempHeight.length-1]);
		
		double sumWomen = 0.0;
		int totalWomen = 0;
		int totalMen = 0;
		for (int i=0;i<n;++i) {
			if (gender[i].equals("F")) {
				sumWomen += height[i];
				totalWomen += 1;
			}
			else if (gender[i].equals("M")) {
				totalMen += 1;
			}
		}
		System.out.println("");
		System.out.println("Average height of women: " + String.format("%.2f", (double) sumWomen/totalWomen));
		System.out.println("Number of men: " + totalMen);
		
		sc.close();

	}

}
