package main;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Exercises_Topic03_Aula15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of values: ");
		int number = sc.nextInt();
		System.out.println("");
		
		double vector[] = new double[number];
		
		for (int i=0;i<number;i++) {
			System.out.printf("Value %d = ", i);
			vector[i] = sc.nextDouble();			
		}
		
		System.out.println("");
		System.out.printf("SUM = %.2f", DoubleStream.of(vector).sum());
		
		sc.close();

	}

}
