package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_Topic04_Aula12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] distances = new double[3];
		
		for (int i=0; i<3; i++) {
			System.out.print("Distance " + (i+1) + ": ");
			distances[i] = sc.nextDouble();
		}
		
		Arrays.sort(distances);
		
		System.out.println("the largest distance is " + String.format("%.2f", distances[distances.length - 1]));
		
		sc.close();

	}

}
