package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_Topic05_Aula26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount of athletes: ");
		int n = sc.nextInt();
		
		String name[] = new String[n];
		String gender[] = new String[n];
		double height[] = new double[n];
		double weight[] = new double[n];
		double totalWeight = 0;
		double sumMen = 0;
		double sumWomen = 0;
		double sumHeightWomen = 0;
		
		for (int i=0; i<n; ++i) {			
			System.out.println("Athlete #" + (i+1) + ": ");
			System.out.print("Name: ");
			name[i] = sc.next();
			sc.nextLine();
			System.out.print("Gender (F/M): ");
			gender[i] = sc.next();
			if (gender[i] == "M" || gender[i] == "F") {

			}
			else {
				while (!(gender[i]).equals("M") && !(gender[i]).equals("F")) {
					System.out.print("Invalid. Enter F or M for gender: ");
					gender[i] = sc.next();
					System.out.print("");
				}					
			}
			System.out.print("Height: ");
			height[i] = sc.nextDouble();
			if (height[i]<=0) {
				while (height[i]<=0) {
					System.out.print("Invalid. Enter a positive value: ");
					height[i] = sc.nextDouble();
				}
			}
			else {
				
			}
			System.out.print("Weight: ");
			weight[i] = sc.nextDouble();
			if (weight[i]<=0) {
				while (weight[i]<=0) {
					System.out.print("Invalid. Enter a positive value: ");
					weight[i] = sc.nextDouble();
				}
			}
			else {
				
			}
			totalWeight += weight[i];
			if (gender[i].equals("M")) {
				sumMen += 1;
			}
			else {
				
			}
			if (gender[i].equals("F")) {
				sumWomen += 1;
				sumHeightWomen += height[i];
			}
			else {
				
			}			
		}
		
		System.out.println("Average weight: " + String.format("%.2f", totalWeight/weight.length));
		double tempHeight[] = Arrays.copyOf(height, n);
		Arrays.sort(tempHeight);
		double value = tempHeight[tempHeight.length-1];
		int index = Arrays.asList(height).indexOf(value);
		System.out.println("Highest man: " + name[index]);
		System.out.println("Percentage of men: " + (sumMen/gender.length)*100 + "%");
		if (sumWomen==0) {
			System.out.println("There is no female data to show.");
		}
		else {
			System.out.printf("Average high of women: %.2f\n", sumHeightWomen/sumWomen);
		}
		
		sc.close();

	}

}
